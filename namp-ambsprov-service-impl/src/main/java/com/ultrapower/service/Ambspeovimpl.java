package com.ultrapower.service;

import com.ultrapower.dao.*;
import com.ultrapower.dto.*;
import com.ultrapower.pojo.AdcBmPort;
import com.ultrapower.pojo.AdcBmPortAsset;
import com.ultrapower.pojo.BdmProv;
import com.ultrapower.pojo.BdmProvExample;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Ambspeovimpl implements Ambspeovinterface {

    @Autowired
    AdcBmPortAssetMapper portAssetMapper;

    @Autowired
    AmAssetMapper amAssetMapper;

    @Autowired
    BdmProvMapper bdmProvMapper;

    @Autowired
    AmBsProvMapper amBsProvMapper;

    @Autowired
    AdcBmPortMapper adcBmPortMapper;

    /**
     * 省份二级节点
     * @return
     */
    public List<Nodoea> initambapeop() {
        List<AssetTypeDTO> initambapeop = amBsProvMapper.initambapeop();
        List<Nodoea> nodes=new ArrayList<Nodoea>();
        for(int i=0;i<initambapeop.size();i++){
            //获取所有的数据（一级二级节点）
            AssetTypeDTO assetTypeDTO = initambapeop.get(i);

            //获取二级节点
            List<AssetTypeDTO> secondTypes = assetTypeDTO.getSecondTypes();

            //获取所有的一级节点
            Nodoea one = new Nodoea();
            one.setId((i+1)+"");
            one.setName(assetTypeDTO.getName());
            one.setpId(0+"");

            for(int j=0;j<secondTypes.size();j++){
                AssetTypeDTO assetTypeDTO1 = secondTypes.get(j);
                Nodoea two = new Nodoea();
                two.setId((100*(i+1)+j)+"");
                two.setName(assetTypeDTO1.getName());
                two.setpId((i+1)+"");
                nodes.add(two);
            }
            if(secondTypes.size()==0){
                Nodoea two = new Nodoea();
                two.setId((100*(i+1))+"");
                two.setName("暂无子分类");
                two.setpId((i+1)+"");
                nodes.add(two);
            }
            nodes.add(one);
        }
        return nodes;
    }

    /**
     * 端口基准列表
     * @return
     */
    public Map<String,Object> abcbmporplist() {
        Map<String,Object> map = new HashMap<String, Object>();
        //端口基准列表
        List<Abcbmporp> ports = adcBmPortMapper.abcbmporplist();

        //省份下拉框
        BdmProvExample bdmProvExample = new BdmProvExample();
        BdmProvExample.Criteria criteria = bdmProvExample.createCriteria();
        criteria.andProvNameIsNotNull();
        List<BdmProv> provs = bdmProvMapper.selectByExample(bdmProvExample);

        //端口类型下拉框
        List<String> portTypes = Arrays.asList("禁止开放","必须开放");

        //协议下拉框
        List<String> protocal = Arrays.asList("TCP","HTTP");
        //端口基准列表
        map.put("ports",ports);
        //省份下拉框
        map.put("provs",provs);
        //端口类型下拉框
        map.put("portTypes",portTypes);
        //协议下拉框
        map.put("protocal",protocal);
        return map;
    }

    /**
     *添加端口基准里的from表单
     * @return
     */
    public Map<String, Object> Amassetform() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Amassetdto> amassetlist = amAssetMapper.Amassetlist();
        map.put("amassetlist",amassetlist);
        return map;
    }

    /**
     * 添加端口基准里的数据保存到数据库
     * @param portBmReqVO
     * @return
     */
    public Map<String, Object> addAdcBmPort(AdcPortBmReqVO portBmReqVO) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<AdcBmPort> list = portBmReqVO.getAdcBmPort();

        //1.添加端口基准
        List<String> portIds = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            AdcBmPort port = list.get(i);
            String primaryKey = PkUtils.getPrimaryKey();
            port.setPkBmPort(primaryKey);
            port.setVersion("v1.0");
            port.setProvCode("HB");
            port.setIsDeleted(0);
            //创建人，创建时间，修改人，修改时间，是否删除，是否显示
            int insert = adcBmPortMapper.insert(port);
            if (insert > 0) {
                portIds.add(primaryKey);
            }
        }

        if (portBmReqVO.getPkAssets()!=null && !portBmReqVO.getPkAssets().equals("")) {
            //2.端口资产关联表建立对应关系
            String[] assetIds = portBmReqVO.getPkAssets().split(",");
            for (String assetId : assetIds) {
                //每拿到一个资产di，都需要和portIds中的每一个端口id组合一次
                for(String pordId:portIds){
                    //assetId  pordId
                    AdcBmPortAsset portAsset = new AdcBmPortAsset();
                    portAsset.setPkAsset(assetId);
                    portAsset.setPkBmPort(pordId);
                    portAsset.setPkBmPortAsset(PkUtils.getPrimaryKey());
                    int insert = portAssetMapper.insert(portAsset);
                }
            }
        }
        map.put("code",1);
        return map;
    }
}

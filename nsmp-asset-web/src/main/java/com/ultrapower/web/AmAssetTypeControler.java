package com.ultrapower.web;

import com.ultrapower.dto.AssetTypeQueryVO;
import com.ultrapower.dto.Nodoea;
import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetType;
import com.ultrapower.pojo.AmAssetTypeProp;
import com.ultrapower.service.AmAssetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AmAssetTypeControler {

    @Autowired
    AmAssetTypeService amAssetTypeService;

    /**
     * 查询所有可以显示的数据  IS_VIEW=1  IS_DELETED=0
     * @return
     */
    @GetMapping("/AmAssetTypes")
    public List<AmAssetType> findseleteAmAssetType(){
        List<AmAssetType> amAssetTypes = amAssetTypeService.findseleteAmAssetType();
        return amAssetTypes;
    }

    /**
     * 查询所有数据树节点
     * @return
     */
    @GetMapping("/assetTypes")
    public List<Nodoea> assetTypes(){
        return amAssetTypeService.assetTypes();
    }

    /**
     * 根据用户名查询
     * @return
     */
    @GetMapping("/findAmAssetTypeByName")
    public AmAssetType findAmAssetTypeByName(@RequestParam String name){
        return amAssetTypeService.findAmAssetTypeByName(name);
    }

    /**
     * 根据资产创建时间来查询资产信息
     * @param queryVO
     * @return
     */
    @PostMapping("/findAmAssetTypeByCreateTime")
    public List<AmAssetType> findAmAssetTypeByCreateTime(AssetTypeQueryVO queryVO){
        List<AmAssetType> amAssetTypeByCreateTime = amAssetTypeService.findAmAssetTypeByCreateTime(queryVO);
        return amAssetTypeByCreateTime;
    }

    /**
     * 获取所有的一级节点
     * @return
     */
    @GetMapping("/findAmAssetTypebypkAssetType")
    public List<AmAssetType> findAmAssetTypebypkAssetType(){
        List<AmAssetType> amAssetTypebypkAssetType = amAssetTypeService.findAmAssetTypebypkAssetType();
        return amAssetTypebypkAssetType;
    }

    /**
     * 添加资产信息
     * @param assetType
     * @param pkCreator
     * @return
     */
    @PostMapping("/addAssetType")
    public int addAssetType(AmAssetType assetType,@CookieValue("pkNsmpUser") String pkCreator){
        int i = amAssetTypeService.addAssetType(assetType, pkCreator);
        return i;
    }

    /**
     * 通过id来查找数据（编辑ID的回显）
     * @param id
     * @return
     */
    @GetMapping("/findAmAssetTypeById")
    public Map<String, Object> findAmAssetTypeById(@RequestParam String id){
        AmAssetType amAssetType = amAssetTypeService.findAmAssetTypeById(id);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("pkAssetType",amAssetType.getPkAssetType());
        resultMap.put("typeName",amAssetType.getTypeName());
        resultMap.put("typeCode",amAssetType.getTypeCode());
        resultMap.put("typeDesc",amAssetType.getTypeDesc());
        resultMap.put("pkTypeParent",amAssetType.getPkTypeParent());
        return resultMap;
    }

    @GetMapping("/findAssetTypeDataInitEditPage")
    public List<Object> findAssetTypeDataInitEditPage(@RequestParam String id){
        List<AmAssetType> amAssetTypebypkAssetType = amAssetTypeService.findAmAssetTypebypkAssetType();

        AmAssetType amAssetType = amAssetTypeService.findAmAssetTypeById(id);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("pkAssetType",amAssetType.getPkAssetType());
        resultMap.put("typeName",amAssetType.getTypeName());
        resultMap.put("typeCode",amAssetType.getTypeCode());
        resultMap.put("typeDesc",amAssetType.getTypeDesc());
        resultMap.put("pkTypeParent",amAssetType.getPkTypeParent()==null?"root":amAssetType.getPkTypeParent());

        List<Object> objects = new ArrayList<Object>();
        objects.add(amAssetTypebypkAssetType);
        objects.add(resultMap);

        return objects;
    }

    /**
     * 编辑修改资产信息
     * @param amAssetType
     * @param token
     */
    @PostMapping("/saveAssetType")
    public void saveAssetType(AmAssetType amAssetType,@CookieValue("token") String token){
        amAssetTypeService.saveAssetType(amAssetType,token);
    }

    /**
     * 删除资产信息
     * @param id
     * @return
     */
    @PostMapping("/deleteAssetTypeById")
    public Map<String,Object> deleteAssetTypeById(@RequestParam String id){
        return amAssetTypeService.deleteAssetTypeById(id);
    }

    /**
     * 批量删除资产信息
     * @param ids
     * @return
     */
    @GetMapping("/assetTypeBatchDel")
    public Map<String,Object> assetTypeBatchDel(String ids){
        return amAssetTypeService.assetTypeBatchDel(ids);
    }

    /**
     * 资产类型树页面，选中资产类型，加载两部分数据（详情，属性列表）
     * @param name
     * @return
     */
    @GetMapping("findAmAssetTypeAndPropListByName")
    public Map<String, Object> findAmAssetTypeAndPropListByName(@RequestParam String name){
        Map<String, Object> amAssetTypeAndPropListByName = amAssetTypeService.findAmAssetTypeAndPropListByName(name);
        return amAssetTypeAndPropListByName;
    }

    /**
     * 配置资产属性后并保存（修改资产属性）
     * @param assetTypeProp
     * @return
     */
    @PostMapping("/AssetPropController_updateSaveConfigProp")
    public Map<String, Object> updateSaveConfigProp(AmAssetTypeProp assetTypeProp, @CookieValue("current_node_click") String typeName){
        Map<String, Object> map = amAssetTypeService.updateSaveConfigProp(assetTypeProp);
        if(Integer.parseInt(map.get("code")+"") == 1){
            //查询查询数据
            List<AmAssetProp> propList = (List<AmAssetProp>) amAssetTypeService.findAmAssetTypeAndPropListByName(typeName).get("propListByAssetTypeId");
            map.put("propListByAssetTypeId", propList);
        }
        return map;
    }
}

package com.ultrapower.service;

import com.ultrapower.dao.AmBsProvMapper;
import com.ultrapower.dto.AssetTypeDTO;
import com.ultrapower.dto.Nodoea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Ambspeovimpl implements Ambspeovinterface {

    @Autowired
    AmBsProvMapper amBsProvMapper;


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
}

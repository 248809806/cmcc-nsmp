package com.ultrapower.web;

import com.ultrapower.dto.AddAssetDTO;
import com.ultrapower.dto.AmAssetPropDTO;
import com.ultrapower.pojo.AmAssetType;
import com.ultrapower.pojo.AmBsProv;
import com.ultrapower.service.AmAssetsevice;
import com.ultrapower.utils.SerializeUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/AmAssetController")
public class AmAssetController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    AmAssetsevice amAssetsevice;

    @GetMapping("/getAssetTypes")
    public Map<String,Object> getAssetTypes(){
        Map<String,Object> map = new HashMap<String, Object>();
        List<AmAssetType> assetTypes = amAssetsevice.getAmAssetType();
        List<AmBsProv> bsProv = amAssetsevice.getAmBsProv();
        map.put("assetTypes",assetTypes);
        map.put("bsProv",bsProv);
        return map;
    }

    /**
     * 根据ID查询绑定属性的数据
     * @param pkAssetType
     * @return
     */
    @GetMapping("/getAmAssetProplist")
    public List<AmAssetPropDTO> getAmAssetProplist(String pkAssetType){
        List<AmAssetPropDTO> amAssetProplist = amAssetsevice.getAmAssetProplist(pkAssetType);
        return amAssetProplist;
    }

    /**
     * 保存资产属性添加列表里的数据
     * @return
     */
    @PostMapping("/addAsset")
    public Map<String,Object> addAsset(@RequestBody AddAssetDTO addAssetDTO){
        Map<String, Object> map = amAssetsevice.addAsset(addAssetDTO);
        //添加成功后，向消息队列中写入一个消息
        if(Integer.parseInt(map.get("code")+"") == 1 ){
            String rountingKey = "assetFilesBindingKey";
            //{pkAsset}/{type}
            Map<String, Object> messageValue = new HashMap<String, Object>();
            messageValue.put("pkAsset",map.get("pkAsset"));
            messageValue.put("type","insert");
            amqpTemplate.convertAndSend(rountingKey,SerializeUtil.serialize(messageValue));
        }
        return map;
    }

    /**
     * 点击添加资产里面的编辑回显数据
     * @param pkAsset
     * @return
     */
    @GetMapping("/getAssetAndPropValue")
    public Map<String,Object> getAssetAndPropValue(@RequestParam String pkAsset){
        Map<String, Object> map = amAssetsevice.getAssetAndPropValue(pkAsset);
        return map;
    }
}

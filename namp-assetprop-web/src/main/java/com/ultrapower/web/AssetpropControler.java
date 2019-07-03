package com.ultrapower.web;


import com.ultrapower.dao.AmAssetMapper;
import com.ultrapower.dto.AmassetpvlistVO;
import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.service.AmAssetTypeService;
import com.ultrapower.service.AssetpropserviceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AssetpropControler {

    @Autowired
    AssetpropserviceInterface assetpropservice;

    @Autowired
    AmAssetTypeService amAssetTypeService;

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 查询所以可以显示的数据（am_asset_prop）
     *
     * @return
     */
    @GetMapping("/findAllAmAssetProp")
    public List<AmAssetProp> findAllAmAssetProp() {
        List<AmAssetProp> allAmAssetProp = assetpropservice.findAllAmAssetProp();
        return allAmAssetProp;
    }

    /**
     * 在表格中显示属性数据(属性分类,业务分类,采集方式)
     * 实现分页功能
     *
     * @return
     */
    @GetMapping("assetPropPageInit")
    public Map<String, Object> assetPropPageInit(@RequestParam(defaultValue = "1") int pageNum,
                                                 @RequestParam(defaultValue = "3") int pageSize) {
        String key = "proplist_" + pageNum + "_" + pageSize;
        Boolean bol = redisTemplate.boundHashOps("proplist").hasKey(key);
        if (bol) {
            Map<String, Object> stringObjectMap = assetpropservice.assetPropPageInit(pageNum, pageSize);
            System.out.println("从redis中查询的数据");
            return stringObjectMap;
        }
        //从MySQL中查询出数据并保存到reids中
        Map<String, Object> stringObjectMap = assetpropservice.assetPropPageInit(pageNum, pageSize);
        redisTemplate.boundHashOps("proplist").put(key, stringObjectMap);
        System.out.println("从mysql中查询的数据");
        return stringObjectMap;
    }

    /**
     * 根据 类型名称 查询没有被绑定的属性
     *
     * @param nodeName
     * @return
     */
    @GetMapping("initBoundPropPage")
    public List<AmAssetProp> findPropByTypeNameNotBound(@RequestParam String nodeName) {
        List<AmAssetProp> propByTypeNameNotBound = assetpropservice.findPropByTypeNameNotBound(nodeName);
        return propByTypeNameNotBound;
    }

    /**
     * 为指定类型绑定属性(添加过后并重新刷新页面)
     *
     * @param propIds
     * @return
     */
    @GetMapping("boundAssetTypeProps")
    public Map<String, Object> boundAssetTypeProps(@RequestParam String propIds, @RequestParam String typeName) {
        Map<String, Object> map = assetpropservice.boundAssetTypeProps(propIds, typeName);
        //绑定成功后，重新查询
        List<AmAssetProp> propList = (List<AmAssetProp>) amAssetTypeService.findAmAssetTypeAndPropListByName(typeName).get("propListByAssetTypeId");
        map.put("propListByAssetTypeId", propList);
        return map;
    }

    /**
     * 通过id来查找数据（编辑ID的回显）
     *
     * @param
     * @return
     */
    @GetMapping("/findAmAsset")
    public AmAssetProp findAmAssetTypeById(@RequestParam String id) {
        AmAssetProp amAssetTypeById = assetpropservice.findAmAssetTypeById(id);
        return amAssetTypeById;
    }

    /**
     * 删除资产信息
     *
     * @param id
     * @return
     */
    @PostMapping("/deleteAssetType")
    public Map<String, Object> deleteAssetTypeById(@RequestParam String id) {
        Map<String, Object> map = assetpropservice.deleteAssetTypeById(id);
        return map;
    }

    /**
     * 根据用户名进行模糊查询
     *
     * @param propname
     * @param typename
     * @return
     */
    @GetMapping("/Assetporpcontroller_servicebyname")
    public List<AmAssetProp> Assetporpcontroller_servicebyname(@RequestParam String propname, @RequestParam String typename) {
        List<AmAssetProp> amAssetProps = assetpropservice.Assetporpcontroller_servicebyname(propname, typename);
        return amAssetProps;
    }

    /**
     * 资产类型树页面解绑操作
     *
     * @param pkAssetProp
     * @param typeName
     * @return
     */
    @GetMapping("/AssetPropController_unbundle")
    public Map<String, Object> unbundle(@RequestParam String pkAssetProp, @RequestParam String typeName) {
        Map<String, Object> map = assetpropservice.unbundle(pkAssetProp, typeName);
        //绑定成功后，重新查询
        List<AmAssetProp> propList = (List<AmAssetProp>) amAssetTypeService.findAmAssetTypeAndPropListByName(typeName).get("propListByAssetTypeId");
        map.put("propListByAssetTypeId", propList);
        return map;
    }

    /**
     * 配置属性，页面数据加载回显
     *
     * @param current_node_click
     * @param current_prop_config
     * @return
     */
    @GetMapping("/AssetPropController_configShow")
    Map<String, Object> configShow(@CookieValue("current_node_click") String current_node_click, @CookieValue("current_prop_config") String current_prop_config) {
        Map<String, Object> map = assetpropservice.configShow(current_node_click, current_prop_config);
        return map;
    }

    /**
     * 添加资产属性表以及枚举类型对应的值域表
     * @param amassetpvlistVO
     * @return
     */
    @PostMapping("/addassetlist")
    public Map<String, Object> addassetlist(@RequestBody AmassetpvlistVO amassetpvlistVO) {
        Map<String, Object> addassetlist = assetpropservice.addassetlist(amassetpvlistVO);
        return addassetlist;
    }

    /**
     * 查询（添加资产）里面的列表
     * @return
     */
    @GetMapping("/selectassetinitlist")
    public Map<String, Object> selectassetinitlist(){
        Map<String, Object> map = assetpropservice.selectassetinitlist();
        return map;
    }
}

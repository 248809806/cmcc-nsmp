package com.ultrapower.service;

import com.ultrapower.pojo.AmAssetProp;

import java.util.List;
import java.util.Map;

public interface AssetpropserviceInterface {

    /**
     * 查询所以可以显示的数据（am_asset_prop）
     * @return
     */
    List<AmAssetProp> findAllAmAssetProp();

    /**
     *在表格中显示属性数据(属性分类,业务分类,采集方式)
     * @return
     */
    Map<String, Object> assetPropPageInit(int pageNum,int pageSize);

    /**
     * 根据类型名称查询id
     * @param nodeName
     * @return
     */
    String getTypeIdByTypeName(String nodeName);

    /**
     * 根据 类型名称 查询没有被绑定的属性
     * @param nodeName
     * @return
     */
    List<AmAssetProp> findPropByTypeNameNotBound(String nodeName);

    /**
     * 为指定类型绑定属性
     * @param propIds
     * @return
     */
    Map<String,Object> boundAssetTypeProps( String propIds,String typeName);

    /**
     * 删除资产信息
     * @param id
     * @return
     */
    Map<String, Object> deleteAssetTypeById(String id);

    /**
     *查询所有数据
     * @param
     * @return
     */
    AmAssetProp findAmAssetTypeById(String id);

    /**
     * 根据用户名进行模糊查询
     * @param propname
     * @param typename
     * @return
     */
    List<AmAssetProp> Assetporpcontroller_servicebyname(String propname,String typename);

    /**
     * 资产类型树页面解绑操作
     * @param pkAssetProp
     * @param typeName
     * @return
     */
    Map<String, Object> unbundle(String pkAssetProp, String typeName);

    /**
     * 资产类型树页面配置页面数据的回显
     * @param current_node_click
     * @param current_prop_config
     * @return
     */
    Map<String, Object> configShow(String current_node_click, String current_prop_config);

}


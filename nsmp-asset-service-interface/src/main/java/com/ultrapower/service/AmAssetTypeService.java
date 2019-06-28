package com.ultrapower.service;

import com.ultrapower.dto.AssetTypeQueryVO;
import com.ultrapower.dto.Nodoea;
import com.ultrapower.pojo.AmAssetType;
import com.ultrapower.pojo.AmAssetTypeProp;

import java.util.List;
import java.util.Map;

public interface AmAssetTypeService {

    /**
     * 查询所有可以显示的数据  IS_VIEW=1  IS_DELETED=0
     * @return
     */
    public List<AmAssetType> findseleteAmAssetType();


    /**
     * 根据用户名查询
     * @return
     */
    AmAssetType findAmAssetTypeByName(String name);

    /**
     * 查询数据树节点
     * @return
     */
    List<Nodoea> assetTypes();

    /**
     * 根据资产创建时间来查询资产信息
     * @param queryVO
     * @return
     */
    List<AmAssetType> findAmAssetTypeByCreateTime(AssetTypeQueryVO queryVO);

    /**
     * 获取所有的一级节点
     * @return
     */
    List<AmAssetType> findAmAssetTypebypkAssetType();

    /**
     * 添加资产信息
     * @param assetType
     * @param pkCreator
     * @return
     */
    int addAssetType(AmAssetType assetType,String pkCreator);

    /**
     * 通过id来查找数据（编辑ID的回显）
     * @param id
     * @return
     */
    AmAssetType findAmAssetTypeById(String id);

    /**
     * 编辑修改资产信息
     * @param amAssetType
     * @param token
     */
    void saveAssetType(AmAssetType amAssetType, String token);

    /**
     * 删除资产信息
     * @param id
     * @return
     */
    Map<String, Object> deleteAssetTypeById(String id);

    /**
     * 批量删除资产信息
     * @param ids
     * @return
     */
    Map<String, Object> assetTypeBatchDel(String ids);

    /**
     * 资产类型树页面，选中资产类型，加载两部分数据（详情，属性列表）
     * @param name
     * @return
     */
    Map<String, Object> findAmAssetTypeAndPropListByName(String name);

    /**
     * 配置资产属性后并保存（修改资产属性）
     * @param assetTypeProp
     * @return
     */
    Map<String, Object> updateSaveConfigProp(AmAssetTypeProp assetTypeProp);
}

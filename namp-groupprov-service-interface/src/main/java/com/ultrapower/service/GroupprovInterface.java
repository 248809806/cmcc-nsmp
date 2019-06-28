package com.ultrapower.service;
import com.ultrapower.dto.*;
import com.ultrapower.pojo.AmBsProv;
import com.ultrapower.pojo.BdmProv;

import java.util.List;
import java.util.Map;

public interface GroupprovInterface {

    /**
     * 集团资产树（3级节点）
     * @return
     */
    List<BsGroupVO> initBsGroupTree();

    /**
     *集团资产列表
     * @param nodeId
     * @return
     */
    Map<String,Object> findTableDataByNodeId(String nodeId);

    /**
     * 根据指定集团业务系统ID，查询省份业务系统等信息
     * @param groupId
     * @return
     */
    List<ProvDTO> selectProvByGroupId(String groupId);

    /**
     * 返回省份的集合
     * @return
     */
    List<BdmProv> selectProvDate();

    /**
     * 根据页面传输过来的数据进行添加（手动映射表中的5个表格数据）
     * @param groupId
     * @param bsProvIds
     * @param token
     * @return
     */
    public Map<String, Object> saveGroupProvMapping(String groupId, String bsProvIds,String token);

    /**
     * 查询省份表中可以在页面显示的数据（未绑定未删除）
     * @param provCode
     * @param groupId
     * @return
     */
    List<AmBsProv> findBsProvByProvCode(String provCode, String groupId);

    /**
     * 查询省份表中没有绑定的数据
     * @param provRegex
     * @return
     */
    public Map<String, Object> bsGroupProvMappingByProvRegex(String provRegex);

    /**
     * 删除省份业务系统映射
     * @param groupBsId
     * @param provBsId
     * @return
     */
    int deleteProvGroupMapping( String groupBsId, String provBsId);

    /**
     * 手动映射添加功能
     * @param groupDTO
     * @param token
     * @return
     */
    Map<String, Object> bsGroupAdd(AddGroupDTO groupDTO, String token);

    /**
     * 根据指定的ID删除集团业务系统
     * @param pkBsGroup
     * @return
     */
    Map<String,Object> deleteBsGroupById(String pkBsGroup);


    /**
     * 初始化查询管辖资产
     * @return
     */
    Map<String,Object> initMgAssetQuery(GroupMgAssetQueryVO queryVO);

    /**
     * 查询集团业务系统管辖的资产（方法2）
     * @param
     * @return
     */
    List<BsGroupMgAsset> selectBsGroupMgAsset(GroupMgAssetQueryVO queryVO);

    /**
     * 重新映射
     * @param groupDTO
     * @param token
     * @return
     */
    Map<String, Object> saveGroupProvRemapping(AddGroupDTO groupDTO,String token);
}

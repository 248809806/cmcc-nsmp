package com.ultrapower.web;

import com.ultrapower.dto.*;
import com.ultrapower.pojo.AmBsProv;
import com.ultrapower.pojo.BdmProv;
import com.ultrapower.service.GroupprovInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/BsGroupProvController")
public class groupprovControler {

    @Autowired
    GroupprovInterface groupprovInterface;

    /**
     * 集团资产树（3级节点）
     * @return
     */
    @GetMapping("/bsGroupTree")
    Map<String,Object> bsGroupTree(){
        List<BsGroupVO> bsGroupVOS = groupprovInterface.initBsGroupTree();

        List<Map<String,Object>> tree = new ArrayList<Map<String, Object>>();

        /*对bsGroupVOS循环，每循环一次，得到一个一级节点*/
        for (int i = 0 ; i < bsGroupVOS.size() ; i++){
            Map<String,Object> firstNode = new HashMap<String,Object>();
            firstNode.put("id",(i+1));//id从1开始
            firstNode.put("pId",0);
            firstNode.put("name",bsGroupVOS.get(i).getBsName());
            firstNode.put("nodepk",bsGroupVOS.get(i).getPkBsGroup());
            if(i==0){
                firstNode.put("open",true);//只有当前是第一个一级节点，才让他open
            }
            tree.add(firstNode);

            //每一个一级节点都有一组二级节点
            List<BsGroupVO> second = bsGroupVOS.get(i).getSecond();
            for(int j = 0 ; second!=null && second.size()>0 && j < second.size() ;j++){
                BsGroupVO bsGroupVO = second.get(j);//二级节点

                Map<String,Object> secondNode = new HashMap<String,Object>();
                secondNode.put("id",100+(j+1));//id从101开始
                secondNode.put("pId",(i+1));
                secondNode.put("name",bsGroupVO.getBsName());
                secondNode.put("nodepk",bsGroupVO.getPkBsGroup());

                tree.add(secondNode);


                //每一个二级节点有一组三级节点
                List<BsGroupVO> third = bsGroupVO.getThird();
                for (int k = 0 ; third!=null && third.size()>0 && k < third.size() ; k++){
                    BsGroupVO three = third.get(k);//三级节点

                    Map<String,Object> threeNode = new HashMap<String,Object>();
                    threeNode.put("id",1011+k);//id从1011开始
                    threeNode.put("pId",100+(j+1));
                    threeNode.put("name",three.getBsName());
                    threeNode.put("nodepk",three.getPkBsGroup());

                    tree.add(threeNode);
                }

            }

        }
        Map<String,Object> result = new HashMap<String, Object>();/* 也可以直接在处理器接口方法参数上声明一个map   Map<String,Object> map*/
        result.put("bsGroupTree",tree);

        return result;
    }

    /**
     * 集团资产列表
     * @param nodeId
     * @return
     */
    @GetMapping("/findTableDataByNodeId")
    Map<String,Object> findTableDataByNodeId(@RequestParam String nodeId){
        Map<String, Object> map = groupprovInterface.findTableDataByNodeId(nodeId);
        return map;
    }

    /**
     * 删除省份业务系统映射
     * @param groupBsId
     * @param provBsId
     * @return
     */
    @GetMapping("/deleteProvGroupMapping")
    Map<String,Object> deleteProvGroupMapping(@RequestParam String groupBsId,@RequestParam String provBsId){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = groupprovInterface.deleteProvGroupMapping(groupBsId, provBsId);
        if(i>0){
            map.put("code",1);//成功
            return map;
        }
        map.put("code",-1);//失败
        return map;
    }

    /**
     * 返回省份的集合
     * @return
     */
    @GetMapping("/initProvData")
    Map<String,Object> initProvData(){
        Map<String,Object> map = new HashMap<String,Object>();
        List<BdmProv> amBsProvs = groupprovInterface.selectProvDate();
        map.put("amBsProvs",amBsProvs);

        return map;
    }

    /**
     * 查询省份表中可以在页面显示的数据（已绑定未删除）
     * @param provCode
     * @param groupId
     * @return
     */
    @GetMapping("/findBsProvByProvCode")
    Map<String,Object> findBsProvByProvCode(@RequestParam String provCode,@CookieValue("groupId") String groupId){
        Map<String,Object> map = new HashMap<String,Object>();
        List<AmBsProv> bsProvByProvCode = groupprovInterface.findBsProvByProvCode(provCode,groupId);
        map.put("bsProvByProvCode",bsProvByProvCode);

        return map;
    }

    /**
     * 保存映射关系
     * @param groupId
     * @param bsProvIds
     * @param token
     * @return
     */
    @GetMapping("/saveGroupProvMapping")
    Map<String,Object> saveGroupProvMapping(@RequestParam String groupId,
                                            @RequestParam String bsProvIds,
                                            @CookieValue("token") String token){

        Map<String, Object> map = groupprovInterface.saveGroupProvMapping(groupId, bsProvIds, token);

        //保存成功之后，重新查询一下该集团映射了那了省份节点
        List<ProvDTO> provDTOS = groupprovInterface.selectProvByGroupId(groupId);
        map.put("provDTOS",provDTOS);

        return map;
    }

    /**
     * 查询省份表中没有绑定的数据
     * @param provRegex
     * @return
     */
    @GetMapping("/bsGroupProvMappingByProvRegex")
    Map<String,Object> bsGroupProvMappingByProvRegex(@RequestParam String provRegex){
        Map<String, Object> map = groupprovInterface.bsGroupProvMappingByProvRegex(provRegex);
        return map;
    }

    /**
     * 手动映射添加功能（往2个表中添加数据）
     * @param groupDTO
     * @param token
     * @return
     */
    @PostMapping("/bsGroupAdd")
    Map<String,Object> bsGroupAdd(AddGroupDTO groupDTO, @CookieValue("token") String token){
        Map<String, Object> map = groupprovInterface.bsGroupAdd(groupDTO, token);
        return map;
    }

    /**
     * 根据指定的ID删除集团业务系统
     * @param pkBsGroup
     * @return
     */
    @PostMapping("/deleteBsGroupById")
    Map<String,Object> deleteBsGroupById(@RequestParam("groupId") String pkBsGroup){
        Map<String, Object> map = groupprovInterface.deleteBsGroupById(pkBsGroup);
        Integer code = (Integer) map.get("code");
        if(code == 1 ){
            Map<String, Object> map1 = bsGroupTree();//删除成功，重新查询业务系统树
            map1.put("code",1);
        }
        return map;
    }


    /**
     * 点击【管辖资产加载3块数据：省份select，类型select，table】
     * @param groupId
     * @return
     */
    @GetMapping("/initMgAssetQuery")
    Map<String,Object> initMgAssetQuery(@CookieValue("groupId") String groupId){
        GroupMgAssetQueryVO queryVO = new GroupMgAssetQueryVO();
        queryVO.setGroupId(groupId);
        Map<String, Object> map = groupprovInterface.initMgAssetQuery(queryVO);
        return map;
    }


    /**
     * 点击 管辖资产-->查询
     * @param queryVO
     * @return
     */
    @GetMapping("/searchMgAsset")
    Map<String,Object> searchMgAsset(@CookieValue("groupId") String groupId,GroupMgAssetQueryVO queryVO){
        queryVO.setGroupId(groupId);
        List<BsGroupMgAsset> bsGroupMgAssets = groupprovInterface.selectBsGroupMgAsset(queryVO);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bsGroupMgAssets",bsGroupMgAssets);
        return map;
    }

    /**
     * 重新映射
     * @param groupDTO
     * @param token
     * @param groupId
     * @return
     */
    @GetMapping("/saveGroupProvRemapping")
    Map<String,Object> saveGroupProvRemapping(AddGroupDTO groupDTO,@CookieValue("token") String token,@CookieValue("groupId") String groupId){
        groupDTO.setPkBsGroup(groupId);
        Map<String, Object> map = groupprovInterface.saveGroupProvRemapping(groupDTO, token);
        return map;//pkBsParent  bsProvIds mappingRegex
    }
}

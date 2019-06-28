package com.ultrapower.web;

import com.ultrapower.dao.AmAssetMapper;
import com.ultrapower.pojo.AmAssetExample;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

public class Jobs {

    @Autowired
    AmAssetMapper amAssetMapper;
    //任务1
    public void job1() {
        AmAssetExample amAssetExample = new AmAssetExample();
        AmAssetExample.Criteria criteria = amAssetExample.createCriteria();
        criteria.andAssetIpIsNull();
        amAssetMapper.deleteByExample(amAssetExample);
        System.out.println("job1:"+new Date(System.currentTimeMillis()));
    }
    //任务2
    public void job2() {
        System.out.println("job2:"+new Date(System.currentTimeMillis()));
    }
}

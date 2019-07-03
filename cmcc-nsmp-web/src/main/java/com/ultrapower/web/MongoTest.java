package com.ultrapower.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-mongodb.xml")
public class MongoTest {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void test1(){
        Demo demo = new Demo();
        demo.setOid("111");
        demo.setOname("jek");
        mongoTemplate.insert(demo);
    }

    @Test
    public void test2(){
        List<Demo> all = mongoTemplate.findAll(Demo.class);
        System.out.println(all);
    }

    @Test
    public void test3(){
        Query query = new Query();
        query.addCriteria(Criteria.where("oid").is("111"));

        Update update = new Update();
        update.set("oname","ros");
        mongoTemplate.updateMulti(query,update,Demo.class);
    }


    @Test
    public void test4(){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is("5d197bc4b98d450924edc1dd"));
        mongoTemplate.remove(query,Demo.class);
    }



}

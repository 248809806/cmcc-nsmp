package com.ultrapower.mq;

import com.ultrapower.utils.SerializeUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.IOException;
import java.util.Map;

public class AssetFilesConsumer implements MessageListener {

    public void onMessage(Message message) {
        //有消息的时候，自动进入该方法内
        byte[] body = message.getBody();
        Map<String,Object> map = (Map<String,Object>)SerializeUtil.unserialize(body);
        System.out.println(map);


        String url = "http://localhost:8888/es/nsmp/updateEs/"+map.get("pkAsset")+"/"+map.get("type");
        HttpGet httpGet = new HttpGet(url);

        HttpClient httpClient = new DefaultHttpClient();

        try {
            HttpResponse response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

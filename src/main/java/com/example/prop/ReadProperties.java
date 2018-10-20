package com.example.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ReadProperties {
    @Autowired
    private MyProperties myProperties;
    @Value("${kafka.topicsCount}")
    private int topics;
    @Value("${kafka.topic1}")
    private String topic1;

    public void readDyn() {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        for (int i = 1; i <= topics; i++) {
            myHashMap.put(i, "topic" + i);
        }
    }


    public void printProperties(){
        System.out.println("w klasie ReadProperties email="+myProperties.getEmail());
        System.out.println("w klasie ReadProperties topic1="+topic1);
    }
}

package com.example.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("kafka")
public class KafkaProperties {
    private int topicsCount;
    private String topic1;
    private String topic2;
    private String topic3;
    private List<TopicHandler> topics;

    public static class TopicHandler{
        String topic;
        String handler;

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getHandler() {
            return handler;
        }

        public void setHandler(String handler) {
            this.handler = handler;
        }
    }

    public int getTopicsCount() {
        return topicsCount;
    }

    public void setTopicsCount(int topicsCount) {
        this.topicsCount = topicsCount;
    }

    public List<TopicHandler> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicHandler> topics) {
        this.topics = topics;
    }

    public String getTopic1() {
        return topic1;
    }

    public void setTopic1(String topic1) {
        this.topic1 = topic1;
    }

    public String getTopic2() {
        return topic2;
    }

    public void setTopic2(String topic2) {
        this.topic2 = topic2;
    }

    public String getTopic3() {
        return topic3;
    }

    public void setTopic3(String topic3) {
        this.topic3 = topic3;
    }
}

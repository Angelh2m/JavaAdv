package com.app.pros.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Description"),
            new Topic("Spring2", "Spring Framework2", "Description2")
    ));

    public  List<Topic> getAllTopics(){
        return  this.topics;
    }

    public Topic getTopic(String id){
        return this.topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }

    public Topic addTopic(Topic topic){
        this.topics.add(topic);
        return topic;
    }

    public void updateTopic(String id, Topic topic){
        for (int i = 0; i < this.topics.size(); i++) {
            Topic t = this.topics.get(i);
            if (t.getId().equals(id)){
                this.topics.set(i, topic);
                return;
            }
        }
    }

    public void  deleteTopic(String id){
        this.topics.removeIf(t -> t.getId().equals(id));
    }

}

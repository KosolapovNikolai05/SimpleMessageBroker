package BrokerClasses;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@Component
public class Broker {
    private HashMap<String , Topic> topics = new HashMap<>();

    public void addTopic (Topic topic) {
        topics.put(topic.getTopicTitle() , topic);
    }

    public Topic getTopic (String titleTopic) {
        return topics.get(titleTopic);
    }
}

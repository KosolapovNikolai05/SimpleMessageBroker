package BrokerClasses;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.Queue;

@Data
public class Topic {
    private String topicTitle;
    private Integer ID = 1;
    private Queue<Message> partition = new ArrayDeque<>();

    public void sendMessage (Message message){
        message.setID(ID);
        partition.add(message);
        ID ++;
    }

    public Topic (String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Message getMessage () {
        return partition.remove();
    }
}

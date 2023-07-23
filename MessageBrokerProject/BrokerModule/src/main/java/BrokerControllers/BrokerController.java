package BrokerControllers;

import BrokerClasses.Broker;
import BrokerClasses.Message;
import BrokerClasses.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/broker")
public class BrokerController {
    private final Broker broker;

    @Autowired
    public BrokerController(Broker broker) {
        this.broker = broker;
    }

    @GetMapping("/get/{title}")
    public Message getMessage (@PathVariable("title") String titleTopic) {
        return broker.getTopic(titleTopic).getMessage();
    }


    @PostMapping("/send/{title}")
    public void sendMessage (@RequestBody Message message, @PathVariable("title") String titleTopic) {
        broker.getTopic(titleTopic).sendMessage(message);
    }

    @PostMapping("/create/{title}")
    public void createTopic (@PathVariable("title") String title) {
        Topic topic = new Topic(title);
        broker.addTopic(topic);
    }

    @GetMapping("/info")
    public HashMap<String , Topic> getBrokerInfo() {
        return broker.getTopics();
    }

}
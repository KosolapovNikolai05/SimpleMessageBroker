package ProducerClasses;

import BrokerClasses.BrokerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/producer")

public class MessageSendController {
    private final MessageGenerator messageGenerator;
    private final RestTemplate restTemplate;

    public MessageSendController(MessageGenerator messageGenerator, RestTemplate restTemplate) {
        this.messageGenerator = messageGenerator;
        this.restTemplate = restTemplate;
    }

    @PostMapping("/send/{title}")
    public void sendMessage (@PathVariable("title") String title) {
        BrokerClient brokerClient = new BrokerClient(restTemplate);
        brokerClient.sendMessage(title , messageGenerator.generateMessageContent());
    }
}

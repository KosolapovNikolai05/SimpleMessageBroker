package ConsumerClasses;

import BrokerClasses.BrokerClient;
import BrokerClasses.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class MessageGetController {
    private final RestTemplate restTemplate;

    @Autowired
    public MessageGetController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/get/{title}")
    public Message getMessage(@PathVariable("title") String title) {
        BrokerClient bk = new BrokerClient(restTemplate);
        return bk.getMessage(title);
    }
}

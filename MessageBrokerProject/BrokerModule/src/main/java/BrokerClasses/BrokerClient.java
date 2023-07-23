package BrokerClasses;


import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

public class BrokerClient {
    private final RestTemplate restTemplate;

    public BrokerClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;}

    public void sendMessage(String title, String value) {
        Message message = new Message(value , LocalDateTime.now());
        restTemplate.postForObject("http://localhost:9994/broker/send/{title}", message , Message.class , title);
    }
    public Message getMessage(String title) {
        return restTemplate.getForObject("http://localhost:9994/broker/get/{title}" ,Message.class, title);
    }
}

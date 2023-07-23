package BrokerControllers;

import BrokerClasses.Broker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BrokerConfig {
    @Bean
    public Broker broker(){return new Broker();}
    @Bean
    public RestTemplate template (){
        return new RestTemplate();
    }
}

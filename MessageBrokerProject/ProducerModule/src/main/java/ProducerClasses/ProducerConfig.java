package ProducerClasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProducerConfig {
    @Bean
    public RestTemplate template (){
        return new RestTemplate();
    }
    @Bean
    public MessageGenerator messageGenerator (){
        return new MessageGenerator();
    }

}

package ConsumerClasses;

import ProducerClasses.MessageGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfig {
    @Bean
    public RestTemplate restTemplate(){return new RestTemplate();}
    @Bean
    public MessageGenerator messageGenerator (){
        return new MessageGenerator();
    }

}

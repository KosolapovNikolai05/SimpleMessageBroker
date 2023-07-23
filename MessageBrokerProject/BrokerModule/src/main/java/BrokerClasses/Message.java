package BrokerClasses;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Message {
    private Integer ID;
    private String value;
    private LocalDateTime timestamp;


    public Message(String value , LocalDateTime timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }
}

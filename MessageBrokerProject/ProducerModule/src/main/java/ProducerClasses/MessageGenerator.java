package ProducerClasses;

import java.util.Random;

public class MessageGenerator {
    private String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String generateMessageContent () {
        Random random = new Random();
        char[] text = new char[1000];
        for (int i = 0; i < 1000; i ++)
        {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }
}

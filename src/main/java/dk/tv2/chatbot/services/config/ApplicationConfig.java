package dk.tv2.chatbot.services.config;

import dk.tv2.chatbot.services.ChatbotService;
import dk.tv2.chatbot.services.model.Configuration;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by pean
 */
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {

        register(ChatbotService.class);

        Configuration configuration = new Configuration();
        configuration.add("conf_key_1", ApplicationEnvironment.getInstance().get("conf_key_1"));
        configuration.add("conf_key_2", ApplicationEnvironment.getInstance().get("conf_key_2"));
        configuration.add("conf_key_3", ApplicationEnvironment.getInstance().get("conf_key_3"));
        configuration.add("conf_key_4", ApplicationEnvironment.getInstance().get("conf_key_4"));


    }
}



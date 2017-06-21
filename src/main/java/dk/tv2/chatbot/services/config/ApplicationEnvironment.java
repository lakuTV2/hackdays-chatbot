package dk.tv2.chatbot.services.config;

import dk.tv2.chatbot.services.model.Configuration;
import dk.tv2.play.backend.config.EnvironmentConfig;

/**
 * Created by pean
 */
public class ApplicationEnvironment extends EnvironmentConfig {
    private static ApplicationEnvironment instance;
    public final static Configuration CONFIGURATION;

    static {
        CONFIGURATION = new Configuration();
        CONFIGURATION.add("conf_key_1", ApplicationEnvironment.getInstance().get("conf_key_1"));
        CONFIGURATION.add("conf_key_2", ApplicationEnvironment.getInstance().get("conf_key_2"));
        CONFIGURATION.add("conf_key_3", ApplicationEnvironment.getInstance().get("conf_key_3"));
        CONFIGURATION.add("conf_key_4", ApplicationEnvironment.getInstance().get("conf_key_4"));

    }
    public ApplicationEnvironment() {
        super("chatbot",
                "conf_key_1",
                "conf_key_2",
                "conf_key_3",
                "conf_key_4"


        );
    }

    public static ApplicationEnvironment getInstance() {
        return instance;
    }

    public static Configuration getCONFIGURATION() {
        return CONFIGURATION;
    }
}
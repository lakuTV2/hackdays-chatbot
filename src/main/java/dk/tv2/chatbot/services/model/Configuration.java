package dk.tv2.chatbot.services.model;

import dk.tv2.play.backend.config.ConfigException;

import java.util.Map;

/**
 * Created by pean
 */
public class Configuration {
private Map<String, String> keyValueMap;

    public Configuration() {
    }

    public Configuration(Map<String, String> keyValueMap) {
        this.keyValueMap = keyValueMap;
    }

    public Map<String, String> getKeyValueMap() {
        return keyValueMap;
    }

    public void setKeyValueMap(Map<String, String> keyValueMap) {
        this.keyValueMap = keyValueMap;
    }

    public String getValueByKey(String key)
    {
        String value = keyValueMap.get(key);
        if(value == null) {
            throw new ConfigException("no value for key: " + key);
        }
        return value;
    }

    public void add(String key, String value) {
        keyValueMap.put(key,value);

    }
}

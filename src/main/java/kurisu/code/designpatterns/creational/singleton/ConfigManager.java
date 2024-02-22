package kurisu.code.designpatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static ConfigManager instance;
    private Map<String, Object> settings = new HashMap<>();

    private ConfigManager(){

    }

    public static ConfigManager getInstance(){
        if(instance == null)
            instance = new ConfigManager();
        return instance;
    }

    public void set(String key, Object val){
        settings.put(key, val);
    }

    public Object get(String key){
        if( settings.containsKey(key))
            return settings.get(key);
        return "";
    }
    
}

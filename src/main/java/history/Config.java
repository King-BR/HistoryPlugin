package history;

import arc.Core;
import org.json.JSONObject;

public class Config {
    JSONObject config;

    public Config() {
        config = new JSONObject(Core.settings.getDataDirectory().child("mods/HistoryPlugin/config.json").readString());
    }

    public Object get(String key) {
        return config.get(key);
    }

    public boolean getBoolean(String key) {
        return (boolean)config.get(key);
    }

    public int getInt(String key) {
        return ((Long)config.get(key)).intValue();
    }

    public String getString(String key) {
        return (String)config.get(key);
    }
}

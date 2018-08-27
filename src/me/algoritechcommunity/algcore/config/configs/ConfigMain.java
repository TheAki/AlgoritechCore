package me.algoritechcommunity.algcore.config.configs;

import me.algoritechcommunity.algcore.AlgCore;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigMain extends YamlConfiguration {
    private final AlgCore PLUGIN;
    private final File CONFIG_FILE;

    public ConfigMain(AlgCore plugin) {
        this.PLUGIN = plugin;
        this.CONFIG_FILE = new File(this.PLUGIN.getDataFolder(), "config.yml");
        this.saveDefault();
        this.reload();
    }

    public void saveDefault() {
        this.PLUGIN.saveResource("config.yml",false);
    }

    public void reload() {
        try {
            super.load(this.CONFIG_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            super.save(this.CONFIG_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

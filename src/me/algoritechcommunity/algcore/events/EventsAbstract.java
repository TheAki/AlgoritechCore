package me.algoritechcommunity.algcore.events;

import me.algoritechcommunity.algcore.AlgCore;
import org.bukkit.event.Listener;


public abstract class EventsAbstract implements Listener {

    private final AlgCore PLUGIN;

    public EventsAbstract(AlgCore plugin) {
        this.PLUGIN = plugin;
        this.PLUGIN.getServer().getPluginManager().registerEvents(this,this.PLUGIN);
    }

    public AlgCore getPlugin() {
        return this.PLUGIN;
    }
}

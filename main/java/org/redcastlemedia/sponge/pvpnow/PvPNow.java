package org.redcastlemedia.sponge.pvpnow;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.event.state.PostInitializationEvent;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.spongepowered.api.event.state.ServerStoppingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.command.CommandService;


/**
 *
 * @author Multi
 */
@Plugin(id="pvpnow", name="PvPNow", version="0.1")
public class PvPNow {
    @Inject
    private static Logger logger;
    public static final String NAME = "PvPNow";
    public static final String VERSION = "0.1-SNAPSHOT";
    public static String getPrefix() {
        return "[" + NAME + "] ";
    }
    public static Logger getLogger() {
        return logger;
    }
    
    
    
    @Subscribe
    public void onPreInit(PreInitializationEvent event) {
        //TODO load configs
    }
    @Subscribe
    public void onInit(InitializationEvent event) {
        //TODO register listeners
        
//        CommandService cmdService = game.getCommandDispatcher();
    }
    @Subscribe
    public void onPostInit(PostInitializationEvent event) {
        //TODO hook other plugins
    }
    
    
    @Subscribe
    public void onServerStart(ServerStartedEvent event) {
        getLogger().info(getPrefix() + "is loaded");
    }
    
    @Subscribe
    public void onServerStop(ServerStoppingEvent event) {
        //TODO code before players are disconnected
    }
}

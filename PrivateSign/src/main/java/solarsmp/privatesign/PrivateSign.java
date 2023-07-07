package solarsmp.privatesign;

import org.bukkit.plugin.java.JavaPlugin;
import solarsmp.privatesign.Listeners.SignListener;

public final class PrivateSign extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SignListener(), this);
        getLogger().info("Lock Sign plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Lock Sign plugin disabled!");
    }
}

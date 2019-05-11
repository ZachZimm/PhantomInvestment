package PhantomInvestment;

import org.bukkit.plugin.java.JavaPlugin;
import org.devotionit.vantage.AlphaVantageClient;

public final class main extends JavaPlugin {
    public AlphaVantageClient client;
    public InvestmentHandler investmentHandler = null;


    @Override
    public void onEnable() {
        // Plugin startup logic
        investmentHandler = new InvestmentHandler("J70KI13721YUA8US");
        this.getCommand("invest").setExecutor(new CommandInvest());
        System.out.println("Phantom Investment Successfully Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

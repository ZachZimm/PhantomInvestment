package PhantomInvestment;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.devotionit.vantage.core.request.QuoteRequest;
import org.devotionit.vantage.core.request.param.Function;
import org.devotionit.vantage.core.request.param.Symbol;
import org.devotionit.vantage.core.request.series.TimeSeriesRequest;
import org.devotionit.vantage.core.response.QuoteResponse;
import org.devotionit.vantage.core.response.TimeSeriesResponse;

import java.util.concurrent.CompletableFuture;

import static org.bukkit.Bukkit.getServer;

public class CommandInvest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//        TimeSeriesRequest timeSeriesRequest = TimeSeriesRequest.stockRequestBuilder()
//                .function(Function.TIME_SERIES_DAILY)
//                .symbol(Symbol.from("MSFT"))
//                .build();
//// synchronously
//        TimeSeriesResponse timeSeriesResponse = main.client.getSync(timeSeriesRequest);
//// asynchronously
//        CompletableFuture<TimeSeriesResponse> future = main.client.getAsync(timeSeriesRequest);
//        System.out.println("Time Series Response : " + future.getNow(timeSeriesResponse).toString());


        return true;
    }
}

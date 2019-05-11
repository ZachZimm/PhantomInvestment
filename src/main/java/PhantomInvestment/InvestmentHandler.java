package PhantomInvestment;

import org.devotionit.vantage.AlphaVantageClient;

public class InvestmentHandler {
    public static AlphaVantageClient client = null;
    public InvestmentHandler(String str)
    {
        client = new AlphaVantageClient(str);
    }

}

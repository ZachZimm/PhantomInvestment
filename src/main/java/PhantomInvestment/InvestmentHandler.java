package PhantomInvestment;

import org.devotionit.vantage.AlphaVantageClient;

public class InvestmentHandler {
    public InvestmentHandler(String str)
    {
        AlphaVantageClient client = new AlphaVantageClient(str);
    }

}

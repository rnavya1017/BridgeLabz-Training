import java.time.LocalDate;
import java.util.ArrayList;

public class StockAccount {

    ArrayList<CompanyShares> list =
            new ArrayList<>();

    public void buy(String symbol,
                    int shares) {

        list.add(new CompanyShares(
                symbol,
                shares,
                LocalDate.now().toString()));

        System.out.println("Shares Purchased");
    }

    public void sell(String symbol,
                     int shares) {

        for (CompanyShares c : list) {

            if (c.symbol.equals(symbol)) {

                if (c.shares >= shares) {
                    c.shares -= shares;
                    System.out.println("Shares Sold");
                } else {
                    System.out.println(
                        "Insufficient Shares");
                }
                return;
            }
        }

        System.out.println("Stock Not Found");
    }

    public void printReport() {

        System.out.println("Stock Details");

        for (CompanyShares c : list) {
            c.display();
        }
    }
}
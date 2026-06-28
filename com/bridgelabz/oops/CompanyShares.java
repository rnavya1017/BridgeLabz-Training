public class CompanyShares {

    String symbol;
    int shares;
    String date;

    public CompanyShares(String symbol,
                         int shares,
                         String date) {
        this.symbol = symbol;
        this.shares = shares;
        this.date = date;
    }

    public void display() {
        System.out.println(symbol + " "
                + shares + " "
                + date);
    }
}
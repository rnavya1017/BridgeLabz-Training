import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        StockPortfolio portfolio = new StockPortfolio(n);

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter stock name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of shares: ");
            int shares = sc.nextInt();

            System.out.print("Enter share price: ");
            double price = sc.nextDouble();

            portfolio.addStock(new Stock(name, shares, price));
        }

        portfolio.displayReport();
    }
}
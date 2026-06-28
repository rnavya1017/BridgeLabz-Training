public class StockPortfolio {

    private Stock[] stocks;
    private int count;

    public StockPortfolio(int size) {
        stocks = new Stock[size];
    }

    public void addStock(Stock stock) {
        stocks[count++] = stock;
    }

    public void displayReport() {
        double total = 0;

        System.out.println("STOCK REPORT");
        System.out.println("------------------");

        for (int i = 0; i < count; i++) {
            stocks[i].display();
            total += stocks[i].calculateValue();
        }

        System.out.println("Total Stock Value = " + total);
    }
}
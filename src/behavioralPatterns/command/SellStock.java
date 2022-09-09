package behavioralPatterns.command;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock stock) {
        this.abcStock = stock;
    }

    public void execute() {
        abcStock.sell();
    }
}

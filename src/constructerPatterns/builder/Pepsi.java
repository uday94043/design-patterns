package constructerPatterns.builder;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "constructionPatterns.builder.Pepsi";
    }
}
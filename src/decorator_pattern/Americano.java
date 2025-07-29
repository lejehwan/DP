package decorator_pattern;

public class Americano implements Beverage {
    @Override
    public String getDescription() {
        return "아메리카노";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}

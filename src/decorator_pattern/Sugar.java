package decorator_pattern;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 설탕";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.3;
    }
}

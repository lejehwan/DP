package decorator_pattern;

public class Whip extends BeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.7;
    }
}

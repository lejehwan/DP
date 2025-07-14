package factory_pattern.factory_method_pattern;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

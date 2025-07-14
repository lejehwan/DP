package factory_pattern.factory_method_pattern;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}

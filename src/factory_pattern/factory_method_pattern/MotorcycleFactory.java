package factory_pattern.factory_method_pattern;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Motorcycle();
    }
}

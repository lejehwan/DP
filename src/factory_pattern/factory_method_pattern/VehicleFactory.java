package factory_pattern.factory_method_pattern;

public abstract  class VehicleFactory {

    public void operateVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }

    protected abstract Vehicle createVehicle();
}

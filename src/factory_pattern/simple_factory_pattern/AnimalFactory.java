package factory_pattern.simple_factory_pattern;

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) return new Dog();
        if ("cat".equalsIgnoreCase(type)) return new Cat();
        throw new IllegalArgumentException("Unknown animal type");
    }
}

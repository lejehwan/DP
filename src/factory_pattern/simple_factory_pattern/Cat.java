package factory_pattern.simple_factory_pattern;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

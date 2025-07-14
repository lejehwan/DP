package factory_pattern.simple_factory_pattern;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

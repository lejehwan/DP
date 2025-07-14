package factory_pattern.abstract_factory_pattern;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

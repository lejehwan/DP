package factory_pattern.abstract_factory_pattern;

public class WindowCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}

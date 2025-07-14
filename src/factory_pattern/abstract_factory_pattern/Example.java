package factory_pattern.abstract_factory_pattern;

public class Example {

    /**
     * 관련 있는 객체들의 "패밀리"를 생성하기 위한 인터페이스를 제공하지만, 구체적인 클래스를 지정하지 않고도 객체들의 집합을 생성할 수 있는 패턴
     * 여러 종류의 제품을 한번에 생성해야 할 때 유용
     *
     * 일관성 유지: 관련된 객체들을 일관된 방식으로 생성
     * 결합도 감소: 클라이언트 코드를 구체적인 구현으로부터 완전히 분리
     * 쉽게 교체 가능
     *
     * 단, 새로운 유형이 추가될 때 마다 모든 팩토리 클래스를 수정해야 할 수 있음
     * 코드량이 많아질 수 있음
     */
    public static void main(String[] args) {
       abstractFactoryPatternExample();
    }

    private static void abstractFactoryPatternExample() {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) factory = new WindowsFactory();
        else if (os.contains("mac")) factory = new MacOSFactory();
        else throw new RuntimeException("Unsupported OS");

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }

}

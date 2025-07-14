package factory_pattern.simple_factory_pattern;

public class Example {

    /**
     * 하나의 팩토리 클래스에서 조건에 따라 여러 종류의 객체를 생성하여 반환
     * new 키워드를 직접 사용하는 대신, 팩토리 메서드를 통해 객체 생성을 추상화
     *
     * 객체 생성 로직을 중앙 집중화하여 관리 용이
     * 객체 생성 코드를 직접 작성하는 것보다 코드 가독성이 높음
     *
     * 단, 생성 객체의 종류가 많아지면 팩토리 클래스가 비대하고 복잡해질 수 있음
     * 새로운 유형이 추가될 때마다, 팩토리 클래스를 수정해야 하므로 OCP를 위반 할 수 있음
     */
    public static void main(String[] args) {
        simpleFactoryPatternExample();
    }

    private static void simpleFactoryPatternExample() {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.makeSound();

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.makeSound();
    }
}

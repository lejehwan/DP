package Facade_pattern;

public class Example {

    /**
     * 퍼사드 패턴(Facade Pattern)
     * 복잡한 하위 시스템을 더 쉽게 사용할 수 있도록 단순화된 인터페이스를 제공하는 구조 디자인 패턴
     * 복잡성 감소: 여러 개의 클래스와 상호작용해야 하는 복잡한 하위 시스템을 하나의 단순한 인터페이스로 묶어 클라이언트가 알아야 할 지식을 최소화
     * 결합도 약화: 클라이언트 코드가 하위 시스템의 구현 세부 사항에 직접 의존하는 것을 방지하여 결합도를 낮춤
     * 사용 편의성 증가: 퍼사드 객체의 단일 메서드를 호출하는 것만으로 원하는 기능을 수행
     *
     * 단, 퍼사드가 너무 많은 기능을 책임지지 않도록(거대 객체) 해야하며, 제공되는 기능 외에 특정 기능 사용시, 우회 또는 퍼사드에 기능을 추가해야 하는 문제도 존재
     */
    public static void main(String[] args) {
        facadePatternExample();
    }

    private static void facadePatternExample() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new TV(), new Amplifier(), new DVDPlayer());

        homeTheater.watchMovie("인셉션");
        System.out.println();
        homeTheater.endMovie();
    }
}

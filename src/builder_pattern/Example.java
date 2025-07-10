package builder_pattern;

public class Example {

    /**
     * 빌더 패턴(Builder Pattern)
     * 객체의 생성과 표현을 분리하여 동일한 생성 절차로 다양하게 객체를 생성할 수 있도록 하는 디자인패턴
     * 복잡한 객체를 생성할 때 특히 유용
     *
     * 복잡한 객체 생성 로직을 캡슐화하고, 객체 생성 코드를 더 읽기 쉽고 유연하게 만들기 효과적인 패턴
     *
     * 복잡한 객체를 생성 할 때
     * 객체 생성 시, 인스턴스의 특정 부분이 선택적으로 필요할 때
     * 생성자 및 생성자의 매개변수가 너무 많을 때
     * 객체 생성 절차와 표현 방법을 분리하고 싶을 때
     */
    public static void main(String[] args) {
        builderPatternExample();
    }

    private static void builderPatternExample() {
        Car sportsCar = new Car.Builder("V8 Engine", 4, "Red")
                .withGPS(true)
                .withSunroof(true)
                .build();
        System.out.println("스포츠 카: " + sportsCar);

        Car sedan = new Car.Builder("V4 Engine", 4, "Silver")
                .withGPS(true)
                .build();
        System.out.println("세단: " + sedan);

        Car truck = new Car.Builder("V8 Engine", 6, "Blue")
                .withGPS(true)
                .build();
        System.out.println("트럭: " + truck);

        Car basicCar = new Car.Builder("Electric Motor", 4, "White")
                .build();
        System.out.println("기본 차: " + basicCar);
    }
}

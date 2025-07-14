package factory_pattern.factory_method_pattern;

public class Example {

    /**
     * 객체 생성을 위한 인터페이스를 정의하되, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정
     * 객체 생성을 서브클래스에 위임하여, 클라이언트 코드가 구체적인 클래스에 의존하지 않음
     *
     * 유연성 및 확장성: 새로운 유형이 추가되어도 기존 클라이언트 코드를 수정할 필요가 없음
     * 느슨한 결합: 클라이언트 코드가 구체적인 클래스에 직접 의존하지 않고, 인터페이스 또는 추상 클래스에 의존
     * 단일 책임 원칙: 객체 생성 로직과 객체 사용 로직이 분리
     *
     * 단, 새로운 제품 유형마다 새로운 팩토리 서브클래스를 만들어야 하므로, 관리해야할 클래스가 많아지고 코드량이 증가
     */
    public static void main(String[] args) {
        factoryMethodPatternExample();
    }

    private static void factoryMethodPatternExample() {
        VehicleFactory carFactory = new CarFactory();
        carFactory.operateVehicle();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.operateVehicle();
    }
}

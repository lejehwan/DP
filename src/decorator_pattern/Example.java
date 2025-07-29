package decorator_pattern;

public class Example {

    /**
     * 데코레이터 패턴(Decorator Pattern)
     * 기존 객체의 구조를 변경하지 않고도 동적으로 확장할 수 있게 해주는 디자인 패턴
     * 기본 기능에 새로운 책임을 덧씌우는 방식
     *
     * 유연한 기능 확장: 기존 코드를 수정하지 않고 새로운 기능을 동적으로 추가
     * 상속의 대안: 상속을 통한 기능 확장이 가져올 클래스 폭발(subclassing explosion)를 해결할 수 있음
     * 단일 책인 원칙 준수: 각 데코레이터는 하나의 추가 기능에 대한 책임만 가짐
     * 단, 과도하게 사용 시 코드 구조가 복잡해지고 객체의 실제 유형을 파악하기 어려움. 또한 객체 생성 오버헤드 발생
     *
     * 자바의 InputStream/OutputStream 또는 Reader/Writer 등이 대표적인 예
     * 압축, 버퍼링, 암호화 등
     */
    public static void main(String[] args) {
        decoratorPatternExample();
    }

    private static void decoratorPatternExample() {
        Beverage americano = new Americano();
        System.out.println(americano.getDescription() + "의 가격: $" + americano.getCost());

        Beverage americanoWithMilk = new Milk(americano);
        System.out.println(americanoWithMilk.getDescription() + "의 가격: $" + americanoWithMilk.getCost());

        Beverage americanoWithMilkAndWhip = new Sugar(americanoWithMilk);
        System.out.println(americanoWithMilkAndWhip.getDescription() + "의 가격: $" + americanoWithMilkAndWhip.getCost());

        Beverage espressoWithMilkAndSugar = new Sugar(new Milk(new Espresso()));
        System.out.println(espressoWithMilkAndSugar.getDescription() + "의 가격: $" + espressoWithMilkAndSugar.getCost());
    }
}

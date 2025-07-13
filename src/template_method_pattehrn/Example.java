package template_method_pattehrn;

public class Example {

    /**
     * 템플릿 메서드 패턴(Template Method Pattern)
     * 알고리즘의 구조를 정의하고, 특정 단계의 구현은 서브클래스에 위임하는 방식
     * 변하지 않는 부분은 상위 클래스에서 정의하고, 변경 가능한 부분은 하위 클래스에서 구현하도록 하는 패턴
     *
     * 알고리즘의 일관성 유지: 상위 클래스에서 알고리즘의 순서를 고정함으로써 모든 하위 클래스가 동일한 기본 흐름을 따르도록 강제
     * 재사용성 및 확장성: 공통 코드는 상위 클래스에서 재사용하고, 가변적인 부분만 하위 클래스에서 재정의하여 기능을 확장
     * 코드 중복 제거: 유사한 로직이 흩어져 있는 것을 방지하고, 한 곳에서 관리할 수 있도록 함.
     *
     * 스프링의 JdbcTemplate
     * 자바 서블릿의 HttpServlet
     * 자바의 IO 추상 클래스들
     */
    public static void main(String[] args) {
        templateMethodPatternExample();
    }

    private static void templateMethodPatternExample() {
        System.out.println("--- 커피 준비 ---");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("--- 티 준비 ---");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

    }


}

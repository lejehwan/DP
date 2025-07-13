package template_method_pattehrn;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("티백으로 차 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬 추가 중");
    }

    @Override
    boolean customerWantsCondiments() {
        System.out.println("차에 레몬을 넣으시겠습니까? (YES/NO) -> NO");
        return false;// 예시
    }
}

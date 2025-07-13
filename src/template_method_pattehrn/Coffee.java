package template_method_pattehrn;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 추가 중");
    }

    @Override
    boolean customerWantsCondiments() {
        System.out.println("커피에 설탕과 우유를 넣으시겠습니까? (YES/NO) -> YES");
        return true;// 예시
    }

}

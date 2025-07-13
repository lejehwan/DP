package template_method_pattehrn;

public abstract  class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }

    abstract void brew();
    abstract  void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // 훅 메서드: 하위 클래스에서 선택적 오버라이딩 메서드 -> 함수형으로 유연하게 대체 가능
    boolean customerWantsCondiments() {
        return true;
    }

}



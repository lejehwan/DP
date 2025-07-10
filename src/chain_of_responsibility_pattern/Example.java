package chain_of_responsibility_pattern;

public class Example {

    /**
     * 책임 연쇄 패턴(Chain of Responsibility Pattern)
     * 요청을 보내는 객체와 요청을 받는 객체의 결합도를 낮추는(decoupling) 디자인 패턴
     * 요청을 처리할 객체가 명확하게 정해져 있지 않고, 여러 객채 중 하나가 처리할 때 사용할 수 있음
     *
     * 역할 분리: 요청을 보내는 객체와 요청을 처리하는 객체를 분리
     * 유연한 흐름: 요청 처리 로직이 동적으로 변경가능
     * 확장성: 새로운 처리자 추가가 쉬움
     *
     * 요청을 처리할 객체를 명시적으로 지정하기 어려울 때
     * 요청을 처리하는 객체를 동적으로 결정하고 싶을 때
     * 요청을 보내는 객체와 받는 객체 간의 결합도를 낮추고 싶을 때
     * 요청 처리 방식을 유연하게 추가하거나 변경하고 싶을 때
     *
     * 요청이 들어올 때, 차례로 실행되며 책임을 나누는 웹 애플리케이션의 Filter / Interceptor 체인
     * 로그 레벨에 따른 로그를 처리하는 로깅 시스템 등
     */
    public static void main(String[] args) {
        chainOfResponsibilityExample();
    }

    private static void chainOfResponsibilityExample() {
        Handler basicSupport = new BasicSupportHandler();
        Handler technicalSupport = new TechnicalSupportHandler();
        Handler managementSupport = new ManagementSupportHandler();

        // 책임 연쇄 구축(순서 중요)
        basicSupport.setNextHandler(technicalSupport);
        technicalSupport.setNextHandler(managementSupport);

        System.out.println("--- 요청 1 ---");
        basicSupport.handleRequest("간단한 질문입니다. 앱 사용법이 궁금해요.");

        System.out.println("--- 요청 2 ---");
        basicSupport.handleRequest("로그인 오류가 발생했습니다. 기술 지원 필요해요.");

        System.out.println("--- 요청 3 ---");
        basicSupport.handleRequest("상품 환불 요청합니다. 매니저 연결해주세요.");

        System.out.println("--- 요청 4 (처리할 핸들러 없음) ---");
        basicSupport.handleRequest("알 수 없는 요청입니다.");
    }
}

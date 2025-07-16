package proxy_pattern.protection_proxy;

public class Example {

    /**
     * 보호 프록시(Protection Proxy)
     * 실제 객체에 대한 접근 권한을 제어. 특정 사용자만 호출할 수 있도록 하거나, 인증/인가 과정을 프록시에서 처리
     * 클라이언트는 실제 객체의 접근 로직이나 내부 구현을 알 필요가 없음. 단지 프록시를 통해 요청을 보내고 프록시가 대신 처리
     * 실제 여러 객체가 있고, 각각에 대해 접근 권한이 복잡하게 얽혀있을 때, 각 실제 객체 내부에 로직을 분산해서 넣는게 아닌 프록시 계층에서 일관된 방식으로 처리
     */
    public static void main(String[] args) {
        protectionProxyExample();
    }

    private static void protectionProxyExample() {
        System.out.println("--- User trying to edit ---");
        Document userDoc = new ProxyDocument("Confidential Report", "USER");
        userDoc.read();
        userDoc.edit();// 권한 O

        System.out.println("\n--- Admin trying to edit ---");
        Document adminDoc = new ProxyDocument("Confidential Report", "ADMIN");
        adminDoc.read();
        adminDoc.edit();// 권한 X
    }
}

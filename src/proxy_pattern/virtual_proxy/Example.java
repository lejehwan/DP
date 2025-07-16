package proxy_pattern.virtual_proxy;

public class Example {


    /**
     * 가상 프록시(Virtual Proxy)
     * 실제 객체가 생성되기 전까지는 프록시 객체가 실제 객체를 대신하여 초기화 지연(Lazy Initialization)을 수행
     * 클라이언트가 실제로 기능을 쓸 때까지 생성을 미루고, 그 전에는 프록시가 대신함
     * 이미지가 많거나 네트워크를 통해 데이터를 가져와야 할 때, 당장 모든 데이터를 로드하지 않고 필요할 때 로드하는 경우에 사용
     */
    public static void main(String[] args) {
        virtualProxyExample();
    }

    private static void virtualProxyExample() {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // 최초 호출 시 로딩 발생
        System.out.println("--- First call to display() for image1 ---");
        image1.display();

        // 두번째 호출 시 로딩 없이 바로 표시
        System.out.println("\n--- Second call to display() for image1 ---");
        image1.display();

        // 최초 호출 시 로딩 발생
        System.out.println("\n--- First call to display() for image2 ---");
        image2.display();
    }
}

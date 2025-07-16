package proxy_pattern.remote_proxy;

import java.rmi.Naming;

public class Example {

    /**
     * 원격 프록시(Remote Proxy)
     * 원격 객체에 대한 로컬 대리인 역할. 실제 객체가 다른 서버에 있을 때, 클라이언트는 로컬 프록시를 통해 원격 객체와 통신
     * 클라이언트는 원격 객체가 로컬에 있는지 원격지에 있는지 알 필요가 없음(추상화하여 숨김)
     */
    public static void main(String[] args) throws Exception{
        RemoteProxyExample();
    }

    private static void RemoteProxyExample() throws Exception{
        // RMI 레지스트리에서 "MyHelloService" 이름으로 등록된 원격 객체 (Stub)를 찾음
        MyRemoteService service = (MyRemoteService) Naming.lookup("rmi://localhost:1099/MyHelloService");

        // 클라이언트는 Stub의 sayHello() 메서드를 호출. 실제로는 원격 서버로 요청이 전달
        String message = service.sayHello();
        System.out.println("Message from remote service: " + message);
    }
}

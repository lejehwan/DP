package proxy_pattern.remote_proxy;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.server.ExportException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServiceImpl extends UnicastRemoteObject implements MyRemoteService {

    protected MyRemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the remote server!";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        // RMI 레지스트리 시작
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        MyRemoteService service = new MyRemoteServiceImpl();
        // 클라이언트가 찾을 서비스 이름을 "MyHelloService"로 바인딩
        java.rmi.Naming.rebind("MyHelloService", service);
        System.out.println("Remote service registered.");
    }
}

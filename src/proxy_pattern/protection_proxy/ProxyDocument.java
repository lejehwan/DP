package proxy_pattern.protection_proxy;

public class ProxyDocument implements Document {

    private RealDocument realDocument;
    private String userRole;// ADMIN, USER

    public ProxyDocument(String content, String userRole) {
        this.realDocument = new RealDocument(content);// Lazy Loading 으로 변경 가능
        this.userRole = userRole;
    }

    @Override
    public void read() {
        realDocument.read();
    }

    @Override
    public void edit() {
        if ("ADMIN".equals(userRole)) {
            realDocument.edit();
        } else {
            System.out.println("Permission denied. Only Admins can edit this document.");
        }
    }
}

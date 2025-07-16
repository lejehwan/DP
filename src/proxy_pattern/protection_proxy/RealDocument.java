package proxy_pattern.protection_proxy;

public class RealDocument implements Document {
    private String content;

    public RealDocument(String content) {
        this.content = content;
        System.out.println("RealDocument created.");
    }

    @Override
    public void read() {
        System.out.println("Reading document: " + content.substring(0, Math.min(content.length(), 20)) + "...");
    }

    @Override
    public void edit() {
        System.out.println("Editing document.");
    }
}

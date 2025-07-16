package proxy_pattern.virtual_proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename + " from disk...");
        try {
            Thread.sleep(2000);// 로딩 시간
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

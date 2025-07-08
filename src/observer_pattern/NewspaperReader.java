package observer_pattern;

public class NewspaperReader implements NewsSubscriber {

    private String name;

    public NewspaperReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("[신문 독자] " + name + "님이 뉴스 수신: \"" + news + "\"");
    }

    @Override
    public String toString() {
        return "신문독자(" + name + ")";
    }
}

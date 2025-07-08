package observer_pattern;

public class MobileAppUser implements NewsSubscriber {

    private String name;

    MobileAppUser(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println("[모바일 앱] " + name + "의 모바일 앱에 푸시 알림: \"" + news + "\"");
    }

    @Override
    public String toString() {
        return "모바일유저(" + name + ")";
    }
}

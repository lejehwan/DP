package observer_pattern;

public interface NewsPublisher {
    void addSubscriber(NewsSubscriber subscriber);
    void removeSubscriber(NewsSubscriber subscriber);
    void notifySubscribers(String news);
}

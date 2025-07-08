package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsPublisher {

    private List<NewsSubscriber> subscribers = new ArrayList<>();
    private String latestNews;

    @Override
    public void addSubscriber(NewsSubscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("구독자 등록");
    }

    @Override
    public void removeSubscriber(NewsSubscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("구독자 해지");
    }

    @Override
    public void notifySubscribers(String news) {
        // 최신 뉴스의 상태가 변경됨
        this.latestNews = news;
        // 각 옵저버들에게 알림
        subscribers.forEach(subscriber -> subscriber.update(news));
    }

    // 외부에서 뉴스를 발행할 때 사용하는 메서드. 즉, 상태 변경을 유발
    public void publishNews(String news) {
        notifySubscribers(news);
    }
}

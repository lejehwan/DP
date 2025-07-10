package chain_of_responsibility_pattern;

public class TechnicalSupportHandler extends Handler {

    private final String SUBJECT = this.getClass().getSimpleName();

    @Override
    public void handleRequest(String request) {
        if (request.contains("기술") || request.contains("오류") || request.contains("버그")) {
            System.out.println(SUBJECT + ": '" + request + "'를 처리했습니다.");
        } else if (nextHandler != null) {
            System.out.println(SUBJECT + ": '" + request + "'를 처리할 수 없습니다. 다음으로 넘깁니다.");
            nextHandler.handleRequest(request);
        } else {
            System.out.println(SUBJECT + ": '" + request + "'를 처리할 수 있는 핸들러가 없습니다.");
        }
    }
}

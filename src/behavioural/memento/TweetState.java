package behavioural.memento;

public class TweetState {

    private String content;

    public TweetState(String text) {
        this.content = text;
    }

    public String getText() {
        return content;
    }

    @Override
    public String toString() {
        return "TweetState{" +
                "content='" + content + '\'' +
                '}';
    }
}

package behavioural.memento;

public class Tweet {

    private StringBuilder content;

    public Tweet(){
        this.content = new StringBuilder();
    }
    public TweetState save(){
        return new TweetState(content.toString());
    }

    public void addText(String text){
        this.content.append(text);
    }
    public void restore(TweetState save){
        this.content = new StringBuilder(save.getText());
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "content=" + content.toString() +
                '}';
    }
}

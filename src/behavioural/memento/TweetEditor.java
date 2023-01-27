package behavioural.memento;

public class TweetEditor {

    private Tweet tweet;

    private TweetState savedTweet;

    public TweetEditor(Tweet tweet){
        this.tweet = tweet;
    }

    public void write(String text){
        tweet.addText(text);
    }

    public void saveTweet(){
        savedTweet = tweet.save();
    }

    public void undo(){
        tweet.restore(savedTweet);
    }

    @Override
    public String toString() {
        return "TweetEditor{" +
                "tweet=" + tweet.toString() +
                ", savedTweet=" + savedTweet.toString() +
                '}';
    }
}

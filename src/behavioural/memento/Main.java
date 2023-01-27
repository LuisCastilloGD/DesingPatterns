package behavioural.memento;

public class Main {

    public static void main(String[] args){
        TweetEditor textEditor = new TweetEditor(new Tweet());
        textEditor.write("Today i felt betrayed\n");
        textEditor.write("Im not sure what to do\n");
        textEditor.saveTweet();

        textEditor.write("But it can get worse\n");
        System.out.println(textEditor);

        textEditor.undo();
        textEditor.write("But everything will be alright :)\n");
        textEditor.saveTweet();
        System.out.println("------------");
        System.out.println(textEditor);

    }

}

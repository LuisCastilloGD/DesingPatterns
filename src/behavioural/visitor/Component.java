package behavioural.visitor;

public abstract class Component {

    private String content;


    public abstract void accept(Visitor visitor);

    Component(String content){
        setContent(content);
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}

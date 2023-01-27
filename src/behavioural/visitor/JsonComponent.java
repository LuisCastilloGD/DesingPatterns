package behavioural.visitor;

public class JsonComponent extends Component{


    JsonComponent(String content) {
        super(content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

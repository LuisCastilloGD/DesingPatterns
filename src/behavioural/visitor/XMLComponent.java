package behavioural.visitor;

public class XMLComponent extends Component{
    XMLComponent(String content) {
        super(content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

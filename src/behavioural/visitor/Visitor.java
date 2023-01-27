package behavioural.visitor;

public interface Visitor {

    void visit(JsonComponent jsonComponent);

    void visit(XMLComponent xmlComponent);

}

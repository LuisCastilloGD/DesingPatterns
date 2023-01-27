package behavioural.visitor;

public class ComponentVisitor implements Visitor{



    @Override
    public void visit(JsonComponent jsonComponent) {
        System.out.println("processing json with content:"+ jsonComponent.getContent());
    }

    @Override
    public void visit(XMLComponent xmlComponent) {
        System.out.println("processing XML with content: "+xmlComponent.getContent());
    }
}

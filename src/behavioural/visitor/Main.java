package behavioural.visitor;

public class Main {

    public static void main(String [] args){



        Document doc = new Document("Document File");

        doc.components.add(new JsonComponent("{json:element}"));
        doc.components.add(new JsonComponent("{example:json}"));
        doc.components.add(new XMLComponent("<example> this is XML </example>"));


        Visitor visitor = new ComponentVisitor();
        doc.accept(visitor);

    }
}

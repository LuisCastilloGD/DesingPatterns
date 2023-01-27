package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Component{

    List<Component> components = new ArrayList<>();

    Document(String content) {
        super(content);
    }

    @Override
    public void accept(Visitor visitor) {
        for(Component component : this.components){
            component.accept(visitor);
        }
    }
}

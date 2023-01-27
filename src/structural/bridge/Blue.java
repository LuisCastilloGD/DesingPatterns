package structural.bridge;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.RGBColor;

public class Blue implements Color{


    @Override
    public void applyColor() {
        System.out.println("Blue");
    }
}

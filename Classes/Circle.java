package Classes;

import AbstractClasses.Figure;
import Interface.CurveLengthlic;

public class Circle extends Figure implements CurveLengthlic {
    public Circle(Double radius) {
        if (radius > 0.0)
            this.radius = radius;
        else
            System.out.println("Нулевой радиус");
    }

    public Double radius;

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public Double getLen() {
        return 2.0 * Math.PI * radius;
    }
}

package Classes;

import AbstractClasses.Polygon;

public class Triangle extends Polygon {
    public Triangle(Double a, Double b, Double c) {
        super(3, new Double[] { a, b, c });
        if ((a <= 0.0 || b <= 0.0 || c <= 0.0) || !(a + b > c && a + c > b && b + c > a))
            System.out.println("Неправильные стороны!");
    }

    @Override
    public Double getArea() {
        Double p = super.getPeremetr() / 2;
        return Math.sqrt(p * (p - getlSides()[0]) * (p - getlSides()[1]) * (p - getlSides()[2]));
    }
}

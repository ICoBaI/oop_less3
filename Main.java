import java.util.ArrayList;
import java.util.Scanner;

import AbstractClasses.Figure;
import AbstractClasses.Polygon;
import Classes.Circle;
import Classes.Rectangle;
import Classes.Square;
import Classes.Triangle;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figDB = new ArrayList<>();
        figDB.add(new Triangle(3.0, 4.0, 5.0));
        figDB.add(new Square(Math.random() * 100));
        figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
        figDB.add(new Circle(Math.random() * 100));

        Scanner sc = new Scanner(System.in);
        String menu ="1. Добавить новую фигуру\n" +
                "2. Посчитать периметр у всех фигур\n" +
                "3. Посчитать площадь у всех фигур\n" +
                "4. Посчитать длины окружностей у всех фигур";
        System.out.println(menu);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("1.Треугольник\n" +
                        "2. Квадрат\n" +
                        "3. Прямоугольник\n" +
                        "4. Круг");
                int type = sc.nextInt();
                switch (type) {
                    case 1:
                        figDB.add(new Triangle(3.0, 4.0, 5.0));
                        break;
                    case 2:
                        figDB.add(new Square(Math.random() * 100));
                        break; 
                    case 3:
                        figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
                        break;
                    case 4:
                        figDB.add(new Circle(Math.random() * 100));
                        break;
                }
                break;
            case 2:
                for (Figure fig : figDB) {
                    if (fig instanceof Polygon)
                        System.out.println(
                                "Периметр " + fig.getClass().getSimpleName() + " = " + ((Polygon) fig).getPeremetr());
                }
                break;
            case 3:
                for (Figure fig : figDB) {
                    System.out.println("Площадь " + fig.getClass().getSimpleName() + " = " + fig.getArea());
                }
                break;
            case 4:
                for (Figure fig : figDB) {
                    if (fig instanceof Circle)
                        System.out.println("Длина окружности = " + ((Circle) fig).getLen());
                }
                break;

        }

    }
}

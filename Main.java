import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu klasy Point z inicjalizacją wartościami
        Point point = new Point(3.5, 4.5);

        // Utworzenie punktu, który będzie służył jako centrum koła
        Point center = new Point(3.5, 4.5);
        // Utworzenie koła z określonym centrum i promieniem
        Circle circle = new Circle(center, 5.0);

        // Utworzenie obiektu klasy ColoredCircle
        ColoredCircle coloredCircle = new ColoredCircle(new Point(1.0, 2.0), 10.0, "czerwony");

        
        
        // Wyświetlenie współrzędnych punktu używając metod getX i getY
        System.out.println("Punkt ma współrzędne: x = " + point.getX() + ", y = " + point.getY());
        // właściwości koła
        System.out.println("Koło ma środek w punkcie: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());

        // Wyświetlenie  obiektu ColoredCircle
        System.out.println("ColoredCircle ma środek w punkcie: (" + 
                            coloredCircle.getCenter().getX() + ", " + 
                            coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień ColoredCircle: " + coloredCircle.getRadius());
        System.out.println("Kolor ColoredCircle: " + coloredCircle.getColor());
        System.out.println("Obwód ColoredCircle: " + coloredCircle.calculatePerimeter());
    }
    }



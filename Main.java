import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu klasy Point z inicjalizacją wartościami
        Point point = new Point(3.5, 4.5);

        // Utworzenie punktu, który będzie służył jako centrum koła
        Point center = new Point(3.5, 4.5);
        // Utworzenie koła z określonym centrum i promieniem
        Circle circle = new Circle(center, 5.0);

        // Wyświetlenie współrzędnych punktu używając metod getX i getY
        System.out.println("Punkt ma współrzędne: x = " + point.getX() + ", y = " + point.getY());
        // właściwości koła
        System.out.println("Koło ma środek w punkcie: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
    }
}


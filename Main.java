import geometry.Point;
import geometry.Rectangle;
import geometry.Square;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        
        Point point = new Point(3.5, 4.5);

        
        Point center = new Point(3.5, 4.5);
       
        Circle circle = new Circle(center, 5.0);

       
        ColoredCircle coloredCircle = new ColoredCircle(new Point(1.0, 2.0), 10.0, "czerwony");
        
        
        Circle[] circles = new Circle[] {
            new Circle(new Point(0, 0), 5),
            new ColoredCircle(new Point(1, 1), 10, "niebieski"),
            new Circle(new Point(2, 2), 3),
            new ColoredCircle(new Point(3, 3), 7, "zielony")
        };

        Rectangle myRectangle = new Rectangle(5.0, 3.0);


        Square mySquare = new Square(4.0);
        
        
        
        System.out.println("Punkt ma współrzędne: x = " + point.getX() + ", y = " + point.getY());
        
        System.out.println("Koło ma środek w punkcie: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());

        
        System.out.println("ColoredCircle ma środek w punkcie: (" + 
                            coloredCircle.getCenter().getX() + ", " + 
                            coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień ColoredCircle: " + coloredCircle.getRadius());
        System.out.println("Kolor ColoredCircle: " + coloredCircle.getColor());
        System.out.println("Obwód ColoredCircle: " + coloredCircle.calculatePerimeter());

        
        for (Circle circle1 : circles) {
            
            System.out.println("Powierzchnia koła: " + circle1.calculateArea());
            
            
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle1 = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle1.getColor());
    }
    }

    double area = myRectangle.calculateArea();
        System.out.println("Pole powierzchni prostokąta: " + area);

    double perimeter = myRectangle.calculatePerimeter();
        System.out.println("Obwód prostokąta: " + perimeter);  
        
        
    double area1 = mySquare.calculateArea();
    System.out.println("Pole powierzchni kwadratu: " + area1);

    double perimeter1 = mySquare.calculatePerimeter();
        System.out.println("Obwód kwadratu: " + perimeter1);


    }




}



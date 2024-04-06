public class Point {

    // Prywatne pola klasy typu double
    private double x;
    private double y;

    // Konstruktor inicjujący pola klasy
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Publiczna metoda do pobierania wartości pola x
    public double getX() {
        return x;
    }

    // Publiczna metoda do pobierania wartości pola y
    public double getY() {
        return y;
    }

    // Publiczna metoda do ustawiania wartości pola x
    public void setX(double x) {
        this.x = x;
    }

    // Publiczna metoda do ustawiania wartości pola y
    public void setY(double y) {
        this.y = y;
    }
}
    


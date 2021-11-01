/**
 * двумерный класс точки.
 **/
public class d2Point {
    protected double xCoord; // Координата x
    protected double yCoord; // Координата y

    public d2Point(double x, double y) { //Конструктор инициализации
        xCoord = x;
        yCoord = y;
    }
    public d2Point() { // Конструктор по умолчанию.
        //Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }
    public double getX() {
        return xCoord;
    }
    public double getY() {
        return yCoord;
    }
    public void setX(double val) {
        xCoord = val;
    }
    public void setY(double val) {
        yCoord = val;
    }
}

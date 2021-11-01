public class d3Point extends d2Point {
    protected double zCoord; // Координата x

    public d3Point(double x, double y, double z) { //Конструктор инициализации
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public d3Point() { // Конструктор по умолчанию.
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean equals(d3Point p ){
        return (p.getX() == xCoord) &&  (p.getY() == yCoord) && (p.getZ() == zCoord);
    }

    public double distanceTo( d3Point p ){
        return Math.ceil(Math.sqrt(Math.pow(xCoord - p.getX(),2) + Math.pow(yCoord - p.getY(),2) + Math.pow(zCoord - p.getZ(),2))*100)/100;
    }
}

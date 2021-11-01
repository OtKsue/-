public class Lab2 {
    public static void main(String[] args) {
        d3Point a = new d3Point(1.0, 2.0, 3.0);
        d3Point b = new d3Point(2.0, 3.0, 4.0);
        d3Point c = new d3Point(5.0, 5.0, 6.0);
        if (a.equals(b) || a.equals(c) || b.equals(c)) {
            System.out.println("Такого треугольника не существует");
        } else {
            System.out.println("Площадь треугольника: ");
            System.out.println(computeArea(a, b, c));
        }
    }

    public static double computeArea(d3Point a, d3Point b, d3Point c) {
        double x = a.distanceTo(b);//расстояние от a до b
        double y = a.distanceTo(c);//расстояние от a до c
        double z = b.distanceTo(c);//расстояние от b до c
        double p = (x + y + z) / 2;
        return Math.ceil(Math.sqrt(p * (p - x) * (p - y) * (p - z)) * 100) / 100; // Умножаем и делим на сто, чтобы точность была два знака после запятой.
    }
}

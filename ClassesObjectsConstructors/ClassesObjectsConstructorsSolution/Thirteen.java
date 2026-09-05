import java.util.*;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceFrom(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

class Result {
    static double distance(double x1, double y1, double x2, double y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        return p1.distanceFrom(p2);
    }
}

class Thirteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        System.out.println(Result.distance(x1, y1, x2, y2));
        s.close();
    }
}
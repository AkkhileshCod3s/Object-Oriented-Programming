import java.util.*;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Result {
    static double calculateArea(double radius) {
        Circle circle = new Circle(radius);
        double a = circle.area();
        return a;
    }
}

class Four {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double radius = s.nextDouble();

        System.out.println(Result.calculateArea(radius));
        s.close();
    }
}
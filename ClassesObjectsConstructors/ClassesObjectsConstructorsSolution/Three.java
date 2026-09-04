import java.util.*;

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int perimeter() {
        return 2 * (length + width);
    }
}

class Result {
    static int calculatePerimeter(int length, int width) {
        Rectangle r = new Rectangle(length, width);
        int a = r.perimeter();
        return a;
    }
}

class Three {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int width = s.nextInt();

        System.out.println(Result.calculatePerimeter(length, width));
        s.close();
    }
}
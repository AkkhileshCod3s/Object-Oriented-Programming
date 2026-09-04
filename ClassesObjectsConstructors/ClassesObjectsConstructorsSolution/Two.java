import java.util.*;

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }
}

class Result {
    static int calculateArea(int length, int width) {
        Rectangle rec = new Rectangle(length, width);
        int a = rec.area();
        return a;
    }
}

class Two {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int width = s.nextInt();

        System.out.println(Result.calculateArea(length, width));
        s.close();
    }
}
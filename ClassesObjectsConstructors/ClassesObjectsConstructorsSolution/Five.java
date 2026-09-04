import java.util.*;

class Box {
    int length;
    int width;
    int height;

    Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    Box(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return this.length * this.width * this.height;
    }
}

class Result {
    static int calculateVolume(int type, int[] values) {
        if (type == 1) {
            Box b = new Box(values[0]);
            return b.volume();
        }
        else if (type == 2) {
            Box b = new Box(values[0], values[1], values[2]);
            return b.volume();
        }
        else {
            Box b = new Box();
            return b.volume();
        }

    }
}

class Five {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int type = s.nextInt();
        int[] values;

        if (type == 1) {
            values = new int[1];
            values[0] = s.nextInt();
        } else if (type == 2) {
            values = new int[3];
            for (int i = 0; i < 3; i++) {
                values[i] = s.nextInt();
            }
        } else {
            values = new int[0];
        }

        System.out.println(Result.calculateVolume(type, values));
        s.close();
    }
}
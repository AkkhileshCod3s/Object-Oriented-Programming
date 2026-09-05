import java.util.*;

class Student {
    static int count = 0;

    Student() {
        count++;
    }
}

class Result {
    static int countObjects(int N) {
        for (int i = 0; i < N; i++) {
            new Student();
        }
        return Student.count;
    }
}

class Twelve {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        System.out.println(Result.countObjects(N));
        s.close();
    }
}
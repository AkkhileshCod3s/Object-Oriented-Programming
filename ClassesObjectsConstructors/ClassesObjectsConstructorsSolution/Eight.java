import java.util.*;

class Student {
    String name;
    int m1, m2, m3;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return (m1 + m2 + m3) / 3.0;
    }

    boolean passed() {
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            return true;
        }
        return false;
    }
}

class Result {
    static String result(String name, int m1, int m2, int m3) {
        Student student = new Student(name, m1, m2, m3);
        return "Total: " + student.total() + "\n" + "Average: " + student.average() + "\n" + "Passed: " + student.passed();
    }
}

class Eight {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();

        System.out.println(Result.result(name, m1, m2, m3));
        s.close();
    }
}
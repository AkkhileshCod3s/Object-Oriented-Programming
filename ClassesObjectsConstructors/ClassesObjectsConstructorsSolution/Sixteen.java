import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    boolean isEqual(Student other) {
        return this.rollNo == other.rollNo && Objects.equals(this.name, other.name);
    }
}

class Result {
    static boolean compare(int roll1, String name1, int roll2, String name2) {
        Student s1 = new Student(roll1, name1);
        Student s2 = new Student(roll2, name2);
        return s1.isEqual(s2);
    }
}

class Sixteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int roll1 = s.nextInt();
        String name1 = s.next();

        int roll2 = s.nextInt();
        String name2 = s.next();

        System.out.println(Result.compare(roll1, name1, roll2, name2));
        s.close();
    }
}
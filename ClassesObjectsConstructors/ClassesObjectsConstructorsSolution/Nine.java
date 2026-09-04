import java.util.*;

class Student {
    int rollNo;
    int marks;

    Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

class Result {
    static String compareStudents(int roll1, int marks1, int roll2, int marks2) {
        Student s1 = new Student(roll1, marks1);
        Student s2 = new Student(roll2, marks2);
        if (s2.marks > s1.marks) {
            return String.valueOf(s2.rollNo);
        }
        else if (marks1 > marks2) {
            return String.valueOf(s1.rollNo);
        }
        else {
            return "Tie";
        }
    }
}

class Nine {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int roll1 = s.nextInt();
        int marks1 = s.nextInt();
        int roll2 = s.nextInt();
        int marks2 = s.nextInt();

        System.out.println(Result.compareStudents(roll1, marks1, roll2, marks2));
        s.close();
    }
}
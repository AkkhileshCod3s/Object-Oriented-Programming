import java.util.*;

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class Result {
    static void studentDetails(String name, int rollNo, double marks) {
        Student student = new Student(name, rollNo, marks);
        student.display();

    }
}

class One {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        int rollNo = s.nextInt();
        double marks = s.nextDouble();

        Result.studentDetails(name, rollNo, marks);
        s.close();
    }
}
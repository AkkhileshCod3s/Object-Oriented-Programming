import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Result {
    static ArrayList<String> aboveAverage(Student[] students) {
        ArrayList<String> aboveAverage = new ArrayList<>();
        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }
        int average = total / students.length;
        for (Student s : students) {
            if (s.marks > average) {
                aboveAverage.add(s.name);
            }
        }
        return aboveAverage;
    }
}

class Eighteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            String name = s.next();
            int marks = s.nextInt();

            students[i] = new Student(name, marks);
        }

        ArrayList<String> result = Result.aboveAverage(students);

        for (String name : result) {System.out.print(name + " ");
        s.close();
        }
    }
}
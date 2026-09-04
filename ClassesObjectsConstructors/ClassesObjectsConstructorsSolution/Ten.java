import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Result {
    static String highestPaid(Employee[] employees) {
        Employee topEarner = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > topEarner.salary) {
                topEarner = employees[i];
            }
        }
        return topEarner.name;
    }
}

class Ten {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Employee[] employees = new Employee[N];

        for (int i = 0; i < N; i++) {
            int id = s.nextInt();
            String name = s.next();
            double salary = s.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println(Result.highestPaid(employees));
        s.close();
    }
}
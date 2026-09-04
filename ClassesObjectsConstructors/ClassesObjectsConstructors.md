# Classes, Objects & Constructors — College Exam Pattern Question Bank

## Covered Patterns

- Class and object creation
- Instance variables and methods
- Parameterized constructors
- Default constructors
- Constructor overloading
- Constructor chaining using `this()`
- `this` keyword
- Multiple methods in a class
- Comparing objects
- Arrays of objects
- Objects passed to methods
- Objects returned from methods
- Static variables with objects
- Real-world class/object calculations
- Constructor-based data processing

---

# 1. Student Details Using Parameterized Constructor

### Question

Create a `Student` class with `name`, `rollNo`, and `marks`. Initialize the object using a parameterized constructor and display the student's details.

### Input Format

The first line contains the student's name.
The second line contains an integer `rollNo`.
The third line contains a floating-point value representing marks.

### Output Format

Print the student's name, roll number, and marks.

### Constraints

```text
1 <= rollNo <= 10^5
0 <= marks <= 100
1 <= length(name) <= 50
```

### Sample Input 1
```text
Akhil
101
87.5
```

### Sample Output 1
```text
Name: Akhil
Roll No: 101
Marks: 87.5
```

### Sample Input 2
```text
Rahul
25
72.0
```

### Sample Output 2
```text
Name: Rahul
Roll No: 25
Marks: 72.0
```

### Predefined Code

```java
import java.util.*;

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        // Write Your Code here
    }

    void display() {
        // Write Your Code here
    }
}

class Result {
    static void studentDetails(String name, int rollNo, double marks) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        int rollNo = s.nextInt();
        double marks = s.nextDouble();

        Result.studentDetails(name, rollNo, marks);
    }
}
```

---

# 2. Rectangle Area Using Constructor

### Question

Create a `Rectangle` class with `length` and `width`. Initialize both values using a parameterized constructor and calculate the area.

### Input Format

The first line contains the length.
The second line contains the width.

### Output Format

Print the area of the rectangle.

### Constraints

```text
1 <= length, width <= 10^4
```

### Sample Input 1
```text
10
5
```

### Sample Output 1
```text
50
```

### Sample Input 2
```text
7
8
```

### Sample Output 2
```text
56
```

### Predefined Code

```java
import java.util.*;

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        // Write Your Code here
    }

    int area() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static int calculateArea(int length, int width) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int width = s.nextInt();

        System.out.println(Result.calculateArea(length, width));
    }
}
```

---

# 3. Rectangle Perimeter Using Constructor

### Question

Create a `Rectangle` class with `length` and `width`. Initialize them using a constructor and calculate the perimeter.

### Input Format

The first line contains the length.
The second line contains the width.

### Output Format

Print the perimeter.

### Constraints

```text
1 <= length, width <= 10^4
```

### Sample Input 1
```text
10
5
```

### Sample Output 1
```text
30
```

### Sample Input 2
```text
7
8
```

### Sample Output 2
```text
30
```

### Predefined Code

```java
import java.util.*;

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        // Write Your Code here
    }

    int perimeter() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static int calculatePerimeter(int length, int width) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int width = s.nextInt();

        System.out.println(Result.calculatePerimeter(length, width));
    }
}
```

---

# 4. Circle Area Using Constructor

### Question

Create a `Circle` class with `radius`. Initialize it using a constructor and calculate the area using `3.14` as π.

### Input Format

The first line contains the radius.

### Output Format

Print the area of the circle.

### Constraints

```text
1 <= radius <= 10^4
```

### Sample Input 1
```text
5
```

### Sample Output 1
```text
78.5
```

### Sample Input 2
```text
10
```

### Sample Output 2
```text
314.0
```

### Predefined Code

```java
import java.util.*;

class Circle {
    double radius;

    Circle(double radius) {
        // Write Your Code here
    }

    double area() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static double calculateArea(double radius) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double radius = s.nextDouble();

        System.out.println(Result.calculateArea(radius));
    }
}
```

---

# 5. Constructor Overloading - Box

### Question

Create a `Box` class with constructor overloading. The class must contain a default constructor that sets all dimensions to `1`, a one-argument constructor that creates a cube, and a three-argument constructor for length, width, and height. Calculate the volume according to the constructor used.

### Input Format

The first line contains `type`.
If `type = 1`, the next line contains one dimension.
If `type = 2`, the next line contains three dimensions.
If `type = 3`, no additional dimensions are given.

### Output Format

Print the volume.

### Constraints

```text
1 <= type <= 3
1 <= dimension <= 10^4
```

### Sample Input 1
```text
1
5
```

### Sample Output 1
```text
125
```

### Sample Input 2
```text
2
2 3 4
```

### Sample Output 2
```text
24
```

### Predefined Code

```java
import java.util.*;

class Box {
    int length;
    int width;
    int height;

    Box() {
        // Write Your Code here
    }

    Box(int side) {
        // Write Your Code here
    }

    Box(int length, int width, int height) {
        // Write Your Code here
    }

    int volume() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static int calculateVolume(int type, int[] values) {
        // Write Your Code here

    }
}

class Main {
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
    }
}
```

---

# 6. Default and Parameterized Constructor

### Question

Create a `Car` class containing `brand` and `year`. Implement a default constructor that sets brand to `Unknown` and year to `0`, and a parameterized constructor that accepts brand and year.

### Input Format

The first line contains `type`.
`0` means use the default constructor.
`1` means read brand and year and use the parameterized constructor.

### Output Format

Print the car brand and year.

### Constraints

```text
0 <= type <= 1
1900 <= year <= 2100
```

### Sample Input 1
```text
0
```

### Sample Output 1
```text
Unknown 0
```

### Sample Input 2
```text
1
Toyota 2025
```

### Sample Output 2
```text
Toyota 2025
```

### Predefined Code

```java
import java.util.*;

class Car {
    String brand;
    int year;

    Car() {
        // Write Your Code here
    }

    Car(String brand, int year) {
        // Write Your Code here
    }

    String details() {
        // Write Your Code here
        return "";
    }
}

class Result {
    static String carDetails(int type, String brand, int year) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int type = s.nextInt();
        String brand = "";
        int year = 0;

        if (type == 1) {
            brand = s.next();
            year = s.nextInt();
        }

        System.out.println(Result.carDetails(type, brand, year));
    }
}
```

---

# 7. Constructor Chaining Using this()

### Question

Create a `Person` class with `name` and `age`. Implement a no-argument constructor that assigns `Unknown` and `0`, and a parameterized constructor that accepts name and age. Use constructor chaining with `this()`. 

### Input Format

The first line contains `type`.
`0` means use the default constructor.
`1` means read name and age and use the parameterized constructor.

### Output Format

Print the person's name and age.

### Constraints

```text
0 <= type <= 1
0 <= age <= 120
```

### Sample Input 1
```text
0
```

### Sample Output 1
```text
Name: Unknown
Age: 0
```

### Sample Input 2
```text
1
Akhil
20
```

### Sample Output 2
```text
Name: Akhil
Age: 20
```

### Predefined Code

```java
import java.util.*;

class Person {
    String name;
    int age;

    Person() {
        // Write Your Code here
    }

    Person(String name, int age) {
        // Write Your Code here
    }

    String details() {
        // Write Your Code here
        return "";
    }
}

class Result {
    static String getDetails(int type, String name, int age) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int type = s.nextInt();
        s.nextLine();

        String name = "";
        int age = 0;

        if (type == 1) {
            name = s.nextLine();
            age = s.nextInt();
        }

        System.out.println(Result.getDetails(type, name, age));
    }
}
```

---

# 8. Student Result Using Multiple Methods

### Question

Create a `Student` class containing name and marks in three subjects. Initialize the fields using a constructor. Create methods to calculate total marks, average marks, and pass status. A student passes only if every subject mark is at least `40`.

### Input Format

The first line contains the student name.
The second line contains three subject marks.

### Output Format

Print total, average, and pass status.

### Constraints

```text
0 <= marks <= 100
```

### Sample Input 1
```text
Akhil
80 70 90
```

### Sample Output 1
```text
Total: 240
Average: 80.0
Passed: true
```

### Sample Input 2
```text
Riya
80 35 90
```

### Sample Output 2
```text
Total: 205
Average: 68.33333333333333
Passed: false
```

### Predefined Code

```java
import java.util.*;

class Student {
    String name;
    int m1, m2, m3;

    Student(String name, int m1, int m2, int m3) {
        // Write Your Code here
    }

    int total() {
        // Write Your Code here
        return 0;
    }

    double average() {
        // Write Your Code here
        return 0;
    }

    boolean passed() {
        // Write Your Code here
        return false;
    }
}

class Result {
    static String result(String name, int m1, int m2, int m3) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();

        System.out.println(Result.result(name, m1, m2, m3));
    }
}
```

---

# 9. Compare Two Student Objects

### Question

Create a `Student` class with roll number and marks. Create two Student objects and compare their marks. Print the roll number of the student having higher marks. If both have equal marks, print `Tie`.

### Input Format

The first line contains roll number and marks of the first student.
The second line contains roll number and marks of the second student.

### Output Format

Print the roll number of the student with higher marks or `Tie`.

### Constraints

```text
1 <= rollNo <= 10^5
0 <= marks <= 100
```

### Sample Input 1
```text
101 85
102 90
```

### Sample Output 1
```text
102
```

### Sample Input 2
```text
101 90
102 90
```

### Sample Output 2
```text
Tie
```

### Predefined Code

```java
import java.util.*;

class Student {
    int rollNo;
    int marks;

    Student(int rollNo, int marks) {
        // Write Your Code here
    }
}

class Result {
    static String compareStudents(
        int roll1, int marks1, int roll2, int marks2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int roll1 = s.nextInt();
        int marks1 = s.nextInt();
        int roll2 = s.nextInt();
        int marks2 = s.nextInt();

        System.out.println(Result.compareStudents(
            roll1, marks1, roll2, marks2));
    }
}
```

---

# 10. Find Employee with Highest Salary

### Question

Create an `Employee` class with employee ID, name, and salary. Read details of `N` employees, create an object for each employee, and find the employee with the highest salary. If multiple employees have the same highest salary, return the first employee.

### Input Format

The first line contains `N`.
Each of the next `N` lines contains `employeeId name salary`.

### Output Format

Print the name of the employee with the highest salary.

### Constraints

```text
1 <= N <= 10^5
1 <= employeeId <= 10^9
0 <= salary <= 10^9
```

### Sample Input 1
```text
3
101 Amit 50000
102 Ravi 65000
103 Neha 60000
```

### Sample Output 1
```text
Ravi
```

### Sample Input 2
```text
2
10 A 50000
20 B 50000
```

### Sample Output 2
```text
A
```

### Predefined Code

```java
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        // Write Your Code here
    }
}

class Result {
    static String highestPaid(Employee[] employees) {
        // Write Your Code here

    }
}

class Main {
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
    }
}
```

---

# 11. Find Oldest Person Using Array of Objects

### Question

Create a `Person` class with name and age. Given details of `N` people, create objects and find the oldest person. If multiple people have the same age, return the first person's name.

### Input Format

The first line contains `N`.
Each of the next `N` lines contains a name and age.

### Output Format

Print the name of the oldest person.

### Constraints

```text
1 <= N <= 10^5
1 <= age <= 120
```

### Sample Input 1
```text
4
Amit 21
Riya 25
Karan 20
Neha 24
```

### Sample Output 1
```text
Riya
```

### Sample Input 2
```text
3
A 30
B 30
C 25
```

### Sample Output 2
```text
A
```

### Predefined Code

```java
import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        // Write Your Code here
    }
}

class Result {
    static String oldestPerson(Person[] people) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Person[] people = new Person[N];

        for (int i = 0; i < N; i++) {
            String name = s.next();
            int age = s.nextInt();

            people[i] = new Person(name, age);
        }

        System.out.println(Result.oldestPerson(people));
    }
}
```

---

# 12. Count Created Objects Using Static Variable

### Question

Create a `Student` class with a static variable that keeps track of how many Student objects have been created. Create `N` objects using the constructor and print the total count.

### Input Format

The first line contains `N`.

### Output Format

Print the number of Student objects created.

### Constraints

```text
1 <= N <= 10^5
```

### Sample Input 1
```text
5
```

### Sample Output 1
```text
5
```

### Sample Input 2
```text
10
```

### Sample Output 2
```text
10
```

### Predefined Code

```java
import java.util.*;

class Student {
    static int count = 0;

    Student() {
        // Write Your Code here
    }
}

class Result {
    static int countObjects(int N) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        System.out.println(Result.countObjects(N));
    }
}
```

---

# 13. Distance Between Two Point Objects

### Question

Create a `Point` class containing `x` and `y` coordinates. Create two Point objects using constructors and calculate the Euclidean distance between them.

### Input Format

The first line contains `x1 y1`.
The second line contains `x2 y2`.

### Output Format

Print the distance.

### Constraints

```text
-10^4 <= x, y <= 10^4
```

### Sample Input 1
```text
0 0
3 4
```

### Sample Output 1
```text
5.0
```

### Sample Input 2
```text
1 1
4 5
```

### Sample Output 2
```text
5.0
```

### Predefined Code

```java
import java.util.*;

class Point {
    double x;
    double y;

    Point(double x, double y) {
        // Write Your Code here
    }

    double distanceFrom(Point other) {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static double distance(
        double x1, double y1, double x2, double y2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        System.out.println(Result.distance(x1, y1, x2, y2));
    }
}
```

---

# 14. Add Two Time Objects

### Question

Create a `Time` class containing hours and minutes. Initialize two objects using constructors. Add the two times and normalize minutes into hours.

### Input Format

The first line contains hours and minutes of the first time.
The second line contains hours and minutes of the second time.

### Output Format

Print the resulting time in the format `hours minutes`.

### Constraints

```text
0 <= hours <= 10^4
0 <= minutes < 60
```

### Sample Input 1
```text
2 45
3 30
```

### Sample Output 1
```text
6 15
```

### Sample Input 2
```text
5 20
1 10
```

### Sample Output 2
```text
6 30
```

### Predefined Code

```java
import java.util.*;

class Time {
    int hours;
    int minutes;

    Time(int hours, int minutes) {
        // Write Your Code here
    }
}

class Result {
    static Time addTime(Time t1, Time t2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        Time t1 = new Time(s.nextInt(), s.nextInt());
        Time t2 = new Time(s.nextInt(), s.nextInt());

        Time result = Result.addTime(t1, t2);

        System.out.println(result.hours + " " + result.minutes);
    }
}
```

---

# 15. Add Two Complex Number Objects

### Question

Create a `Complex` class with real and imaginary parts. Initialize two objects using constructors and add them.

### Input Format

The first line contains real and imaginary parts of the first complex number.
The second line contains real and imaginary parts of the second complex number.

### Output Format

Print the real and imaginary parts of the resulting complex number in the format `real + imagi`.

### Constraints

```text
-10^9 <= real, imaginary <= 10^9
```

### Sample Input 1
```text
3 4
2 5
```

### Sample Output 1
```text
5 + 9i
```

### Sample Input 2
```text
5 -3
2 4
```

### Sample Output 2
```text
7 + 1i
```

### Predefined Code

```java
import java.util.*;

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        // Write Your Code here
    }
}

class Result {
    static Complex add(Complex c1, Complex c2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        Complex c1 = new Complex(s.nextInt(), s.nextInt());
        Complex c2 = new Complex(s.nextInt(), s.nextInt());

        Complex result = Result.add(c1, c2);

        System.out.println(
            result.real + " + " + result.imaginary + "i");
    }
}
```

---

# 16. Check Equality of Two Student Objects

### Question

Create a `Student` class with roll number and name. Create two Student objects and determine whether they represent the same student. Two students are equal if both roll numbers and names are equal.

### Input Format

The first line contains roll number and name of the first student.
The second line contains roll number and name of the second student.

### Output Format

Print `true` if both students are equal; otherwise print `false`.

### Constraints

```text
1 <= rollNo <= 10^5
1 <= length(name) <= 50
```

### Sample Input 1
```text
101 Akhil
101 Akhil
```

### Sample Output 1
```text
true
```

### Sample Input 2
```text
101 Akhil
102 Akhil
```

### Sample Output 2
```text
false
```

### Predefined Code

```java
import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        // Write Your Code here
    }

    boolean isEqual(Student other) {
        // Write Your Code here
        return false;
    }
}

class Result {
    static boolean compare(
        int roll1, String name1, int roll2, String name2) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int roll1 = s.nextInt();
        String name1 = s.next();

        int roll2 = s.nextInt();
        String name2 = s.next();

        System.out.println(Result.compare(
            roll1, name1, roll2, name2));
    }
}
```

---

# 17. Total Cost Using Product Objects

### Question

Create a `Product` class with product name, price, and quantity. Create objects for `N` products and calculate the total cost of all products.

### Input Format

The first line contains `N`.
Each of the next `N` lines contains `name price quantity`.

### Output Format

Print the total cost.

### Constraints

```text
1 <= N <= 10^5
0 < price <= 10^9
0 <= quantity <= 10^4
```

### Sample Input 1
```text
3
Pen 10 5
Book 50 2
Bag 500 1
```

### Sample Output 1
```text
650.0
```

### Sample Input 2
```text
2
A 100 2
B 250 4
```

### Sample Output 2
```text
1200.0
```

### Predefined Code

```java
import java.util.*;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        // Write Your Code here
    }

    double cost() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static double totalCost(Product[] products) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Product[] products = new Product[N];

        for (int i = 0; i < N; i++) {
            String name = s.next();
            double price = s.nextDouble();
            int quantity = s.nextInt();

            products[i] = new Product(name, price, quantity);
        }

        System.out.println(Result.totalCost(products));
    }
}
```

---

# 18. Find Students Above Average Using Objects

### Question

Create a `Student` class with name and marks. Read `N` students, create objects using a constructor, calculate the average marks, and return the names of students whose marks are strictly greater than the average.

### Input Format

The first line contains `N`.
Each of the next `N` lines contains a student name and marks.

### Output Format

Print the names of students whose marks are greater than the average, in their original order.

### Constraints

```text
1 <= N <= 10^4
0 <= marks <= 100
```

### Sample Input 1
```text
4
A 50
B 80
C 60
D 90
```

### Sample Output 1
```text
B D
```

### Sample Input 2
```text
3
A 50
B 50
C 50
```

### Sample Output 2
```text

```

### Predefined Code

```java
import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        // Write Your Code here
    }
}

class Result {
    static ArrayList<String> aboveAverage(Student[] students) {
        // Write Your Code here

    }
}

class Main {
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

        for (String name : result) {
            System.out.print(name + " ");
        }
    }
}
```

---

# 19. Constructor-Based Temperature Conversion

### Question

Create a `Temperature` class. Its constructor accepts a temperature in Celsius. Create a method to convert the temperature to Fahrenheit using `F = (C * 9 / 5) + 32`.

### Input Format

The first line contains the temperature in Celsius.

### Output Format

Print the temperature in Fahrenheit.

### Constraints

```text
-1000 <= Celsius <= 1000
```

### Sample Input 1
```text
0
```

### Sample Output 1
```text
32.0
```

### Sample Input 2
```text
100
```

### Sample Output 2
```text
212.0
```

### Predefined Code

```java
import java.util.*;

class Temperature {
    double celsius;

    Temperature(double celsius) {
        // Write Your Code here
    }

    double toFahrenheit() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static double convert(double celsius) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double celsius = s.nextDouble();

        System.out.println(Result.convert(celsius));
    }
}
```

---

# 20. Invoice Calculation Using Object

### Question

Create an `Invoice` class containing invoice number, item name, quantity, price, and tax percentage. Initialize the object using a constructor and calculate the final invoice amount using subtotal plus tax.

### Input Format

The first line contains invoice number.
The second line contains item name.
The third line contains quantity, price, and tax percentage.

### Output Format

Print the final invoice amount.

### Constraints

```text
1 <= invoiceNumber <= 10^9
1 <= quantity <= 10^5
0 < price <= 10^9
0 <= taxPercentage <= 100
```

### Sample Input 1
```text
1001
Laptop
2 50000 18
```

### Sample Output 1
```text
118000.0
```

### Sample Input 2
```text
1002
Book
5 200 5
```

### Sample Output 2
```text
1050.0
```

### Predefined Code

```java
import java.util.*;

class Invoice {
    int invoiceNumber;
    String itemName;
    int quantity;
    double price;
    double taxPercentage;

    Invoice(
        int invoiceNumber,
        String itemName,
        int quantity,
        double price,
        double taxPercentage) {
        // Write Your Code here
    }

    double finalAmount() {
        // Write Your Code here
        return 0;
    }
}

class Result {
    static double calculateInvoice(
        int invoiceNumber,
        String itemName,
        int quantity,
        double price,
        double taxPercentage) {
        // Write Your Code here

    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int invoiceNumber = s.nextInt();
        s.nextLine();

        String itemName = s.nextLine();

        int quantity = s.nextInt();
        double price = s.nextDouble();
        double taxPercentage = s.nextDouble();

        System.out.println(Result.calculateInvoice(
            invoiceNumber, itemName, quantity,
            price, taxPercentage));
    }
}
```

---

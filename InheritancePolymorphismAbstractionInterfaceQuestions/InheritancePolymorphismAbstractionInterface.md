# Java OOP --- 35 College Exam Coding Questions
### Inheritance • Abstraction • Encapsulation • Polymorphism • Interfaces

## Coverage Map

**Inheritance (Q1--Q7):** single inheritance, multilevel inheritance,
hierarchical inheritance, `super()` constructor chaining, method
overriding, `protected` members, `final` method.

**Abstraction (Q8--Q14):** abstract class with one abstract method,
abstract class with concrete + abstract methods, abstract class
constructor, abstract class used via array of references, template
method pattern, abstract class with multiple abstract methods,
abstract class vs concrete subclass responsibility split.

**Encapsulation (Q15--Q21):** private fields with getters/setters,
validated setter, read-only (final) field, encapsulated array field,
encapsulation with composition, immutable class, private helper
method used internally.

**Polymorphism (Q22--Q28):** compile-time polymorphism (overloading),
runtime polymorphism (overriding), constructor overloading, `toString()`
override, `equals()` override, dynamic method dispatch, upcasting /
downcasting with `instanceof`.

**Interfaces (Q29--Q35):** basic interface implementation, multiple
interface implementation, default method, static method, interface
extending interface, interface reference polymorphism, interface
constants (`public static final`).

------------------------------------------------------------------------

## Question 1: Single Inheritance --- Employee Salary

**Difficulty:** Easy\
**Concept:** Single inheritance, `extends`, constructors, inherited fields

### Problem Statement

Create a base class `Employee` with `name` and `salary`. Derive a class
`Manager` that adds `department`. The `Manager` constructor should
initialize all three values using `super()`. Implement `display()` in
`Manager` to print all details.

### Input Format

Name of employee, Salary, Department

### Constraints

Name contains only alphabets and spaces. Salary is a positive integer.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
Rahul Sharma
50000
IT
```

### Sample Output

``` text
Name: Rahul Sharma
Salary: 50000
Department: IT
```

### Predefined Code

``` java
import java.util.Scanner;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int salary, String department) {
        // Write your code here
    }

    void display() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int salary = Integer.parseInt(s.nextLine());
        String department = s.nextLine();

        Manager m = new Manager(name, salary, department);
        m.display();
    }
}
```

------------------------------------------------------------------------

## Question 2: Multilevel Inheritance --- Publication → Book → EBook

**Difficulty:** Medium\
**Concept:** Multilevel inheritance, chained constructors via `super()`

### Problem Statement

Create a class `Publication` storing `title` and `price`. Derive `Book`
from `Publication`, adding `pages` and `writer`. Derive `EBook` from
`Book`, adding `fileSizeMB`. Each level's constructor must call
`super()` to initialize the parent's fields. `EBook` should override
`putdata()` to print all details including file size.

### Input Format

Title, Price, Pages, Writer, File size in MB

### Constraints

Price and pages are positive numbers. File size is a positive double.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
Java Basics
299
350
Sharma
15.5
```

### Sample Output

``` text
EBook Title "Java Basics", written by "Sharma" has 350 pages, costs 299 rupees, and is 15.5 MB.
```

### Predefined Code

``` java
import java.util.Scanner;

class Publication {
    String title;
    int price;

    Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }
}

class Book extends Publication {
    int pages;
    String writer;

    Book(String title, int price, int pages, String writer) {
        super(title, price);
        this.pages = pages;
        this.writer = writer;
    }
}

class EBook extends Book {
    double fileSizeMB;

    EBook(String title, int price, int pages, String writer, double fileSizeMB) {
        // Write your code here
    }

    void putdata() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String title = s.nextLine();
        int price = Integer.parseInt(s.nextLine());
        int pages = Integer.parseInt(s.nextLine());
        String writer = s.nextLine();
        double size = Double.parseDouble(s.nextLine());

        EBook e = new EBook(title, price, pages, writer, size);
        e.putdata();
    }
}
```

------------------------------------------------------------------------

## Question 3: Hierarchical Inheritance --- Staff → Doctor / Nurse

**Difficulty:** Medium\
**Concept:** Hierarchical inheritance, one parent with multiple children

### Problem Statement

Create a class `Staff` with `id` and `name`. Derive two classes from it:
`Doctor` (adds `specialization`) and `Nurse` (adds `shiftTiming`). Each
subclass should have its own `putdata()` method.

### Input Format

Doctor ID, Doctor name, specialization, Nurse ID, Nurse name, shift timing

### Constraints

IDs are positive integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
1
Dr. Mehta
Cardiology
2
Nurse Anu
Night
```

### Sample Output

``` text
Doctor ID 1: "Dr. Mehta" specializes in Cardiology.
Nurse ID 2: "Nurse Anu" works Night shift.
```

### Predefined Code

``` java
import java.util.Scanner;

class Staff {
    int id;
    String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Doctor extends Staff {
    String specialization;

    Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    void putdata() {
        // Write your code here
    }
}

class Nurse extends Staff {
    String shiftTiming;

    Nurse(int id, String name, String shiftTiming) {
        super(id, name);
        this.shiftTiming = shiftTiming;
    }

    void putdata() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id1 = Integer.parseInt(s.nextLine());
        String name1 = s.nextLine();
        String spec = s.nextLine();
        int id2 = Integer.parseInt(s.nextLine());
        String name2 = s.nextLine();
        String shift = s.nextLine();

        Doctor d = new Doctor(id1, name1, spec);
        Nurse n = new Nurse(id2, name2, shift);
        d.putdata();
        n.putdata();
    }
}
```

------------------------------------------------------------------------

## Question 4: Constructor Chaining Using `super()`

**Difficulty:** Easy\
**Concept:** `super()`, constructor chaining

### Problem Statement

Create a class `Person` with a parameterized constructor accepting
`name`. Derive `Student` with an additional field `rollNo`. The
`Student` constructor must call the parent constructor using `super()`
and initialize the student data. Display both values.

### Input Format

Name, Roll number

### Constraints

Roll number is a positive integer.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
Aman
101
```

### Sample Output

``` text
Name: Aman
Roll No: 101
```

### Predefined Code

``` java
import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        // Write your code here
    }

    void display() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int roll = Integer.parseInt(s.nextLine());

        Student st = new Student(name, roll);
        st.display();
    }
}
```

------------------------------------------------------------------------

## Question 5: Method Overriding --- Animal Sounds

**Difficulty:** Easy\
**Concept:** Method overriding, `@Override`

### Problem Statement

Create a class `Animal` with a method `sound()` that prints
`Animal makes a sound`. Derive `Dog` and override `sound()` to print
`Dog barks`. Call the method using a `Dog` object.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Dog barks
```

### Predefined Code

``` java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```

------------------------------------------------------------------------

## Question 6: `protected` Members Across Packages-Style Access

**Difficulty:** Medium\
**Concept:** `protected` access modifier, inherited field access

### Problem Statement

Create a class `Account` with a `protected` field `balance`. Derive
`SavingsAccount` which directly accesses the inherited `protected`
field (not through a getter) to add interest and print the updated
balance.

### Input Format

Initial balance, interest rate (percentage)

### Constraints

Balance and rate are positive doubles.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
5000
5
```

### Sample Output

``` text
Balance after interest: 5250.0
```

### Predefined Code

``` java
import java.util.Scanner;

class Account {
    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    double rate;

    SavingsAccount(double balance, double rate) {
        super(balance);
        this.rate = rate;
    }

    void addInterest() {
        // Access the inherited protected field "balance" directly
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double balance = Double.parseDouble(s.nextLine());
        double rate = Double.parseDouble(s.nextLine());

        SavingsAccount sa = new SavingsAccount(balance, rate);
        sa.addInterest();
    }
}
```

------------------------------------------------------------------------

## Question 7: `final` Method --- Preventing Override

**Difficulty:** Medium\
**Concept:** `final` method, inherited but non-overridable behavior

### Problem Statement

Create a class `Vehicle` with a `final` method `startEngine()` that
prints `Engine started` (this method cannot be overridden by any
subclass). Derive `Car`, which adds its own method `drive()`. Call both
methods on a `Car` object to show that the inherited `final` method
still works normally.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Engine started
Car is driving
```

### Predefined Code

``` java
class Vehicle {
    final void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    void drive() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.drive();
    }
}
```

------------------------------------------------------------------------

## Question 8: Abstract Class with a Single Abstract Method --- Shapes

**Difficulty:** Easy\
**Concept:** `abstract class`, abstract method, forced implementation

### Problem Statement

Create an abstract class `Shape` with an abstract method
`double area()`. Derive `Square`, which stores `side` and implements
`area()`.

### Input Format

Side length of the square

### Constraints

Side is a positive integer.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
5
```

### Sample Output

``` text
Area of Square: 25.0
```

### Predefined Code

``` java
import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    double area() {
        // Write your code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int side = Integer.parseInt(s.nextLine());

        Shape sh = new Square(side);
        System.out.println("Area of Square: " + sh.area());
    }
}
```

------------------------------------------------------------------------

## Question 9: Abstract Class with Concrete + Abstract Methods --- Appliance

**Difficulty:** Medium\
**Concept:** Abstract class mixing implemented and unimplemented methods

### Problem Statement

Create an abstract class `Appliance` with a concrete method `turnOn()`
that prints `Appliance is ON`, and an abstract method
`int powerConsumption()`. Derive `WashingMachine`, implementing
`powerConsumption()` to return the wattage passed to its constructor.

### Input Format

Wattage of the washing machine

### Constraints

Wattage is a positive integer.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
1200
```

### Sample Output

``` text
Appliance is ON
Washing Machine consumes 1200 watts.
```

### Predefined Code

``` java
import java.util.Scanner;

abstract class Appliance {
    void turnOn() {
        System.out.println("Appliance is ON");
    }

    abstract int powerConsumption();
}

class WashingMachine extends Appliance {
    int watts;

    WashingMachine(int watts) {
        this.watts = watts;
    }

    @Override
    int powerConsumption() {
        // Write your code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int watts = Integer.parseInt(s.nextLine());

        WashingMachine wm = new WashingMachine(watts);
        wm.turnOn();
        System.out.println("Washing Machine consumes " + wm.powerConsumption() + " watts.");
    }
}
```

------------------------------------------------------------------------

## Question 10: Abstract Class with a Constructor --- Instruments

**Difficulty:** Medium\
**Concept:** Abstract classes can have constructors, called via `super()`

### Problem Statement

Create an abstract class `Instrument` with a constructor that stores
`name`, and an abstract method `play()`. Derive `Guitar`, which calls
`super(name)` and implements `play()`.

### Input Format

Name of the guitar

### Constraints

Name is a non-empty string.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
Acoustic Guitar
```

### Sample Output

``` text
Acoustic Guitar is being strummed.
```

### Predefined Code

``` java
import java.util.Scanner;

abstract class Instrument {
    String name;

    Instrument(String name) {
        this.name = name;
    }

    abstract void play();
}

class Guitar extends Instrument {
    Guitar(String name) {
        // Write your code here
    }

    @Override
    void play() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        Instrument i = new Guitar(name);
        i.play();
    }
}
```

------------------------------------------------------------------------

## Question 11: Abstract Class Accessed Only Through Parent Reference --- Payments

**Difficulty:** Medium\
**Concept:** Cannot instantiate abstract class, array of parent references,
runtime polymorphism

### Problem Statement

Design an abstract class `PaymentMethod` with an abstract method
`pay(double amount)`. Implement `CreditCard` and `UPI` classes. In
`main`, store both objects in a `PaymentMethod[]` array and call
`pay()` on each polymorphically.

### Input Format

Amount for Credit Card, Amount for UPI

### Constraints

Amounts are positive doubles.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
1500
750
```

### Sample Output

``` text
Paid 1500.0 using Credit Card.
Paid 750.0 using UPI.
```

### Predefined Code

``` java
import java.util.Scanner;

abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    void pay(double amount) {
        // Write your code here
    }
}

class UPI extends PaymentMethod {
    @Override
    void pay(double amount) {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double amt1 = Double.parseDouble(s.nextLine());
        double amt2 = Double.parseDouble(s.nextLine());

        PaymentMethod[] methods = { new CreditCard(), new UPI() };
        methods[0].pay(amt1);
        methods[1].pay(amt2);
    }
}
```

------------------------------------------------------------------------

## Question 12: Template Method Pattern --- Report Generator

**Difficulty:** Hard\
**Concept:** Abstract class controlling algorithm structure, `final` method
calling abstract steps

### Problem Statement

Create an abstract class `ReportGenerator` with a `final` method
`generate()` that calls two abstract methods, `fetchData()` and
`formatData()`, in sequence. Derive `SalesReport`, implementing both
abstract methods with its own messages.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Fetching Sales data...
Formatting Sales data as table.
```

### Predefined Code

``` java
abstract class ReportGenerator {
    abstract void fetchData();
    abstract void formatData();

    final void generate() {
        fetchData();
        formatData();
    }
}

class SalesReport extends ReportGenerator {
    @Override
    void fetchData() {
        // Write your code here
    }

    @Override
    void formatData() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        SalesReport r = new SalesReport();
        r.generate();
    }
}
```

------------------------------------------------------------------------

## Question 13: Abstract Class with Multiple Abstract Methods --- Employee Types

**Difficulty:** Medium\
**Concept:** Abstract class declaring more than one abstract method

### Problem Statement

Create an abstract class `Employee` declaring two abstract methods:
`double calculateSalary()` and `String designation()`. Derive
`FullTimeEmployee`, which stores a fixed salary and implements both
methods.

### Input Format

Fixed salary

### Constraints

Salary is a positive double.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
50000
```

### Sample Output

``` text
Designation: Full-Time Employee, Salary: 50000.0
```

### Predefined Code

``` java
import java.util.Scanner;

abstract class Employee {
    abstract double calculateSalary();
    abstract String designation();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        // Write your code here
        return 0;
    }

    @Override
    String designation() {
        // Write your code here
        return "";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salary = Double.parseDouble(s.nextLine());

        Employee e = new FullTimeEmployee(salary);
        System.out.println("Designation: " + e.designation() + ", Salary: " + e.calculateSalary());
    }
}
```

------------------------------------------------------------------------

## Question 14: Abstract Class vs Concrete Subclass Responsibility --- Machine

**Difficulty:** Easy\
**Concept:** Abstract class mixing a concrete method with a subclass-specific
abstract method

### Problem Statement

Create an abstract class `Machine` with one abstract method `start()`
and one concrete method `stop()` that prints `Machine stopped`. Create
a class `Printer` extending `Machine` that implements `start()`. Call
both `start()` and `stop()` on a `Printer` object.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Printer starting...
Machine stopped
```

### Predefined Code

``` java
abstract class Machine {
    abstract void start();

    void stop() {
        System.out.println("Machine stopped");
    }
}

class Printer extends Machine {
    @Override
    void start() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.start();
        p.stop();
    }
}
```

------------------------------------------------------------------------

## Question 15: Encapsulation --- BankAccount with Private Fields

**Difficulty:** Easy\
**Concept:** `private` fields, getters/setters, controlled state change

### Problem Statement

Design `BankAccount` with **private** fields `accNo` and `balance`.
Provide `getBalance()`, `deposit(double)`, and `withdraw(double)`
(reject if insufficient funds and print `Insufficient balance`).

### Input Format

Account number, Initial balance, Deposit amount, Withdraw amount (larger
than balance)

### Constraints

All amounts are positive doubles.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
101
1000
500
2000
```

### Sample Output

``` text
Balance: 1000.0
Balance after deposit: 1500.0
Insufficient balance
```

### Predefined Code

``` java
import java.util.Scanner;

class BankAccount {
    private int accNo;
    private double balance;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        // Write your code here
    }

    void withdraw(double amount) {
        // If amount > balance, print "Insufficient balance"
        // Otherwise subtract amount from balance
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int accNo = Integer.parseInt(s.nextLine());
        double balance = Double.parseDouble(s.nextLine());
        double deposit = Double.parseDouble(s.nextLine());
        double withdraw = Double.parseDouble(s.nextLine());

        BankAccount b = new BankAccount(accNo, balance);
        System.out.println("Balance: " + b.getBalance());
        b.deposit(deposit);
        System.out.println("Balance after deposit: " + b.getBalance());
        b.withdraw(withdraw);
    }
}
```

------------------------------------------------------------------------

## Question 16: Encapsulation with Validation Logic --- Age Setter

**Difficulty:** Medium\
**Concept:** Validated setter, protecting object state from invalid input

### Problem Statement

Create a class `Person` with a private field `age`. The setter
`setAge(int)` should only accept values between 0 and 120 (inclusive);
otherwise it should print `Invalid age` and keep the previous value
unchanged.

### Input Format

First age value, Second (invalid) age value

### Constraints

Ages are integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
25
150
```

### Sample Output

``` text
Age set to: 25
Invalid age
Age remains: 25
```

### Predefined Code

``` java
import java.util.Scanner;

class Person {
    private int age;

    void setAge(int age) {
        // Validate range 0-120 before assigning
        // Print "Age set to: X" if valid, else "Invalid age"
        // Write your code here
    }

    int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age1 = Integer.parseInt(s.nextLine());
        int age2 = Integer.parseInt(s.nextLine());

        Person p = new Person();
        p.setAge(age1);
        p.setAge(age2);
        System.out.println("Age remains: " + p.getAge());
    }
}
```

------------------------------------------------------------------------

## Question 17: Encapsulation --- Read-Only Field Using `final`

**Difficulty:** Medium\
**Concept:** `final` field set only via constructor, no setter provided

### Problem Statement

Create a class `Item` with a `final` private field `id` (settable only
through the constructor, with no setter) and a private field `price`
with both a getter and a setter. Demonstrate reading `id`, then reading
and updating `price`.

### Input Format

ID, Initial price, Updated price

### Constraints

ID and prices are positive numbers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
501
250
300
```

### Sample Output

``` text
Item ID: 501, Price: 250.0
Updated Price: 300.0
```

### Predefined Code

``` java
import java.util.Scanner;

class Item {
    private final int id;
    private double price;

    Item(int id, double price) {
        this.id = id;
        this.price = price;
    }

    int getId() {
        return id;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id = Integer.parseInt(s.nextLine());
        double price = Double.parseDouble(s.nextLine());
        double newPrice = Double.parseDouble(s.nextLine());

        Item it = new Item(id, price);
        System.out.println("Item ID: " + it.getId() + ", Price: " + it.getPrice());
        it.setPrice(newPrice);
        System.out.println("Updated Price: " + it.getPrice());
    }
}
```

------------------------------------------------------------------------

## Question 18: Encapsulated Array Field --- Student Marks

**Difficulty:** Medium\
**Concept:** Private array field, computed properties via methods

### Problem Statement

Create a class `Student` with private fields `name` and `marks[]` (an
array of 5 integers). Provide `setMarks(int[])`, `getAverage()`
(returns the average as a double), and `getGrade()` (A if average ≥ 90,
B if ≥ 75, C if ≥ 60, else D) --- all computed internally without direct
field access from `main`.

### Input Format

Name, five marks separated by spaces

### Constraints

Each mark is between 0 and 100.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
Neha
90 85 88 92 80
```

### Sample Output

``` text
Student: Neha, Average: 87.0, Grade: B
```

### Predefined Code

``` java
import java.util.Scanner;

class Student {
    private String name;
    private int[] marks = new int[5];

    Student(String name) {
        this.name = name;
    }

    void setMarks(int[] marks) {
        this.marks = marks;
    }

    double getAverage() {
        // Write your code here
        return 0;
    }

    String getGrade() {
        // Use getAverage() internally
        // Write your code here
        return "";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = s.nextInt();
        }

        Student st = new Student(name);
        st.setMarks(marks);
        System.out.println("Student: " + name + ", Average: " + st.getAverage() + ", Grade: " + st.getGrade());
    }
}
```

------------------------------------------------------------------------

## Question 19: Encapsulation with Composition --- Car and Engine

**Difficulty:** Medium\
**Concept:** Private object reference, delegated getter, encapsulation
across two classes

### Problem Statement

Create a class `Engine` with a private field `horsepower` and its
getter/setter. Create a class `Car` with a private `Engine` field and a
method `getEngineHP()` that internally calls the engine's getter,
without exposing the `Engine` object directly.

### Input Format

Horsepower value

### Constraints

Horsepower is a positive integer.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
150
```

### Sample Output

``` text
Car's Engine Horsepower: 150
```

### Predefined Code

``` java
import java.util.Scanner;

class Engine {
    private int horsepower;

    Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    int getHorsepower() {
        return horsepower;
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    int getEngineHP() {
        // Write your code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hp = Integer.parseInt(s.nextLine());

        Engine e = new Engine(hp);
        Car c = new Car(e);
        System.out.println("Car's Engine Horsepower: " + c.getEngineHP());
    }
}
```

------------------------------------------------------------------------

## Question 20: Immutable Class --- Point

**Difficulty:** Hard\
**Concept:** Immutability, all fields `final` and private, no setters

### Problem Statement

Create an immutable class `Point` with `final` private fields `x` and
`y`, set only via the constructor. Provide only getters. Add a method
`translate(int dx, int dy)` that returns a **new** `Point` object with
shifted coordinates instead of modifying the current one.

### Input Format

x, y, dx, dy

### Constraints

All values are integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
3
4
2
1
```

### Sample Output

``` text
Original: (3, 4)
Translated: (5, 5)
```

### Predefined Code

``` java
import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() { return x; }
    int getY() { return y; }

    Point translate(int dx, int dy) {
        // Return a NEW Point with shifted coordinates
        // Write your code here
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());
        int dx = Integer.parseInt(s.nextLine());
        int dy = Integer.parseInt(s.nextLine());

        Point p1 = new Point(x, y);
        System.out.println("Original: (" + p1.getX() + ", " + p1.getY() + ")");
        Point p2 = p1.translate(dx, dy);
        System.out.println("Translated: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
```

------------------------------------------------------------------------

## Question 21: Encapsulation with a Private Helper Method --- Inventory

**Difficulty:** Medium\
**Concept:** Private helper method used only internally by public methods

### Problem Statement

Create a class `Inventory` with private fields `itemName`, `quantity`,
`pricePerUnit`. Add a private helper method `calculateValue()` that
returns `quantity * pricePerUnit`, and a public method `totalValue()`
that calls this private helper and returns its result.

### Input Format

Item name, Quantity, Price per unit

### Constraints

Quantity and price are positive numbers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
Notebook
50
20.0
```

### Sample Output

``` text
Item: Notebook, Quantity: 50, Total Value: 1000.0
```

### Predefined Code

``` java
import java.util.Scanner;

class Inventory {
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    Inventory(String itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    private double calculateValue() {
        // Write your code here
        return 0;
    }

    double totalValue() {
        // Call the private helper method here
        // Write your code here
        return 0;
    }

    String getItemName() { return itemName; }
    int getQuantity() { return quantity; }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int qty = Integer.parseInt(s.nextLine());
        double price = Double.parseDouble(s.nextLine());

        Inventory inv = new Inventory(name, qty, price);
        System.out.println("Item: " + inv.getItemName() + ", Quantity: " + inv.getQuantity() + ", Total Value: " + inv.totalValue());
    }
}
```

------------------------------------------------------------------------

## Question 22: Compile-Time Polymorphism --- Method Overloading

**Difficulty:** Easy\
**Concept:** Method overloading, same name with different parameter lists

### Problem Statement

Create a class `Calculator` that overloads `add()` for: two integers,
and three integers. Call both versions from `main`.

### Input Format

Two integers, then three integers

### Constraints

All values are integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
3 4
1 2 3
```

### Sample Output

``` text
Sum of two ints: 7
Sum of three ints: 6
```

### Predefined Code

``` java
import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        // Write your code here
        return 0;
    }

    int add(int a, int b, int c) {
        // Write your code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        Calculator c = new Calculator();
        System.out.println("Sum of two ints: " + c.add(a, b));
        System.out.println("Sum of three ints: " + c.add(x, y, z));
    }
}
```

------------------------------------------------------------------------

## Question 23: Runtime Polymorphism --- Shape Drawing via Array

**Difficulty:** Medium\
**Concept:** Method overriding, dynamic method dispatch through an array of
parent-type references

### Problem Statement

Create a class `Shape` with a method `draw()` that prints
`Drawing a shape`. Derive `Circle` and `Square`, each overriding
`draw()` with their own message. Store both objects in a `Shape[]`
array and call `draw()` in a loop.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Drawing a Circle
Drawing a Square
```

### Predefined Code

``` java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        // Write your code here
    }
}

class Square extends Shape {
    @Override
    void draw() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square() };
        for (Shape sh : shapes) {
            sh.draw();
        }
    }
}
```

------------------------------------------------------------------------

## Question 24: Constructor Overloading --- Rectangle

**Difficulty:** Medium\
**Concept:** Multiple constructors in the same class

### Problem Statement

Create a class `Rectangle` with three constructors: a no-argument
constructor (sets `length = width = 1`), a one-argument constructor
(square: `length = width = side`), and a two-argument constructor
(`length`, `width`). Print the area after creating one object of each
kind.

### Input Format

Side for the square constructor, then length and width for the custom
constructor

### Constraints

All values are positive integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
5
4 6
```

### Sample Output

``` text
Default Rectangle Area: 1
Square Rectangle Area: 25
Custom Rectangle Area: 24
```

### Predefined Code

``` java
import java.util.Scanner;

class Rectangle {
    int length, width;

    Rectangle() {
        // Write your code here
    }

    Rectangle(int side) {
        // Write your code here
    }

    Rectangle(int length, int width) {
        // Write your code here
    }

    int area() {
        return length * width;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int side = s.nextInt();
        int l = s.nextInt();
        int w = s.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(side);
        Rectangle r3 = new Rectangle(l, w);

        System.out.println("Default Rectangle Area: " + r1.area());
        System.out.println("Square Rectangle Area: " + r2.area());
        System.out.println("Custom Rectangle Area: " + r3.area());
    }
}
```

------------------------------------------------------------------------

## Question 25: `toString()` Override --- Point Display

**Difficulty:** Easy\
**Concept:** Overriding `Object`'s `toString()` method

### Problem Statement

Create a class `Point` with fields `x` and `y`, and override
`toString()` to return `(x, y)`. Create a `Point` object and print it
directly using `System.out.println(pointObj)`.

### Input Format

x, y

### Constraints

x and y are integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
3
4
```

### Sample Output

``` text
(3, 4)
```

### Predefined Code

``` java
import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        // Write your code here
        return "";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());

        Point p = new Point(x, y);
        System.out.println(p);
    }
}
```

------------------------------------------------------------------------

## Question 26: `equals()` Override --- Comparing Fractions

**Difficulty:** Hard\
**Concept:** Overriding `equals(Object)`, cross-multiplication comparison

### Problem Statement

Create a class `Fraction` with fields `numerator` and `denominator`.
Override `equals(Object o)` to compare two fractions by
cross-multiplication (`a/b == c/d` if `a*d == c*b`). Test with one pair
of fractions.

### Input Format

Numerator1, Denominator1, Numerator2, Denominator2

### Constraints

Denominators are non-zero integers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
1 2
2 4
```

### Sample Output

``` text
Fractions equal: true
```

### Predefined Code

``` java
import java.util.Scanner;

class Fraction {
    int numerator, denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        // Cast o to Fraction, compare using cross-multiplication
        // Write your code here
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int d1 = s.nextInt();
        int n2 = s.nextInt();
        int d2 = s.nextInt();

        Fraction f1 = new Fraction(n1, d1);
        Fraction f2 = new Fraction(n2, d2);
        System.out.println("Fractions equal: " + f1.equals(f2));
    }
}
```

------------------------------------------------------------------------

## Question 27: Dynamic Method Dispatch --- Payment Gateway

**Difficulty:** Medium\
**Concept:** Runtime polymorphism through a parent-type reference variable

### Problem Statement

Create a base class `PaymentGateway` with a method
`processPayment(double amt)` printing `Processing generic payment`.
Derive `Razorpay`, overriding the method with a gateway-specific
message. Store the `Razorpay` object in a `PaymentGateway` reference
variable and invoke the method to demonstrate dynamic binding.

### Input Format

Payment amount

### Constraints

Amount is a positive double.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
999.0
```

### Sample Output

``` text
Processing payment of 999.0 via Razorpay
```

### Predefined Code

``` java
import java.util.Scanner;

class PaymentGateway {
    void processPayment(double amt) {
        System.out.println("Processing generic payment");
    }
}

class Razorpay extends PaymentGateway {
    @Override
    void processPayment(double amt) {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double amt = Double.parseDouble(s.nextLine());

        PaymentGateway pg = new Razorpay();
        pg.processPayment(amt);
    }
}
```

------------------------------------------------------------------------

## Question 28: Upcasting, Downcasting, and `instanceof`

**Difficulty:** Hard\
**Concept:** Upcasting to parent type, safe downcasting with `instanceof`
check

### Problem Statement

Create a class `Animal` with method `eat()`. Derive `Dog`, adding an
extra method `fetch()`. In `main`, upcast a `Dog` object to an `Animal`
reference and call `eat()`. Then check with `instanceof` before
downcasting back to `Dog` to call `fetch()`.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Animal is eating
Dog is fetching the ball
```

### Predefined Code

``` java
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.eat();

        // Check with instanceof, then downcast to Dog and call fetch()
        // Write your code here
    }
}
```

------------------------------------------------------------------------

## Question 29: Basic Interface Implementation --- Drawable

**Difficulty:** Easy\
**Concept:** `interface`, `implements`, mandatory method implementation

### Problem Statement

Create an interface `Drawable` declaring method `draw()`. Class
`Circle` implements it, printing `Drawing a circle.`

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Drawing a circle.
```

### Predefined Code

``` java
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
```

------------------------------------------------------------------------

## Question 30: Multiple Interface Implementation --- Duck

**Difficulty:** Medium\
**Concept:** A class implementing more than one interface (multiple
inheritance of behavior)

### Problem Statement

Create interfaces `Flyable` (method `fly()`) and `Swimmable` (method
`swim()`). Class `Duck` implements **both** interfaces, providing
implementations for `fly()` and `swim()`.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Duck is flying.
Duck is swimming.
```

### Predefined Code

``` java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        // Write your code here
    }

    @Override
    public void swim() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
```

------------------------------------------------------------------------

## Question 31: Interface Default Method --- Vehicle

**Difficulty:** Medium\
**Concept:** `default` method in an interface, inherited without being
overridden

### Problem Statement

Create an interface `Vehicle` with an abstract method `move()` and a
`default` method `fuelType()` that prints `Uses generic fuel`. Class
`ElectricCar` implements only `move()`, but still gets `fuelType()` for
free.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Electric Car moves silently.
Uses generic fuel
```

### Predefined Code

``` java
interface Vehicle {
    void move();

    default void fuelType() {
        System.out.println("Uses generic fuel");
    }
}

class ElectricCar implements Vehicle {
    @Override
    public void move() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.move();
        ec.fuelType();
    }
}
```

------------------------------------------------------------------------

## Question 32: Interface Static Method --- Vehicle Category

**Difficulty:** Medium\
**Concept:** `static` method in an interface, called via interface name (not
object)

### Problem Statement

Add a `static` method `category()` to the `Vehicle` interface that
prints `Category: Transport`. Call it directly using the interface
name, without creating an object.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Category: Transport
```

### Predefined Code

``` java
interface Vehicle {
    static void category() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle.category();
    }
}
```

------------------------------------------------------------------------

## Question 33: Interface Extending Interface --- Pet

**Difficulty:** Hard\
**Concept:** One interface extending another (`interface extends interface`)

### Problem Statement

Create an interface `Animal2` declaring `eat()`. Create an interface
`Pet` that **extends** `Animal2` and adds `play()`. Class `Dog2`
implements `Pet`, providing both `eat()` and `play()`.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Dog is eating.
Dog is playing.
```

### Predefined Code

``` java
interface Animal2 {
    void eat();
}

interface Pet extends Animal2 {
    void play();
}

class Dog2 implements Pet {
    @Override
    public void eat() {
        // Write your code here
    }

    @Override
    public void play() {
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat();
        d.play();
    }
}
```

------------------------------------------------------------------------

## Question 34: Interface Reference for Polymorphism --- Shape2D

**Difficulty:** Medium\
**Concept:** Using an interface type as a reference variable to achieve
polymorphism

### Problem Statement

Create an interface `Shape2D` declaring `double area()`. Classes
`Circle` and `Square` implement it. In `main`, use `Shape2D` reference
variables (not the concrete class types) to hold each object and call
`area()`.

### Input Format

Radius of the circle, Side of the square

### Constraints

Both values are positive numbers.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
7
5
```

### Sample Output

``` text
Area: 153.93804002589985
Area: 25.0
```

### Predefined Code

``` java
import java.util.Scanner;

interface Shape2D {
    double area();
}

class Circle implements Shape2D {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // Write your code here
        return 0;
    }
}

class Square implements Shape2D {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        // Write your code here
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = Double.parseDouble(s.nextLine());
        double side = Double.parseDouble(s.nextLine());

        Shape2D s1 = new Circle(r);
        Shape2D s2 = new Square(side);
        System.out.println("Area: " + s1.area());
        System.out.println("Area: " + s2.area());
    }
}
```

------------------------------------------------------------------------

## Question 35: Interface Constants --- Config Values

**Difficulty:** Easy\
**Concept:** Fields in an interface are implicitly `public static final`
(constants)

### Problem Statement

Create an interface `AppConfig` with a constant `MAX_USERS = 100`
(fields in interfaces are always `public static final`, even without
writing those keywords). Class `Server` implements `AppConfig` and
prints the constant directly.

### Input Format

No input is required.

### Constraints

No input.

### Output Format

Print the required result exactly as demonstrated in the sample output.

### Sample Input

``` text
No input
```

### Sample Output

``` text
Max Users Allowed: 100
```

### Predefined Code

``` java
interface AppConfig {
    int MAX_USERS = 100;
}

class Server implements AppConfig {
    void showConfig() {
        // Access MAX_USERS directly (inherited constant)
        // Write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Server srv = new Server();
        srv.showConfig();
    }
}
```

------------------------------------------------------------------------

## Final Revision Checklist

After solving all 35, you should be comfortable with:

**Inheritance**
- [ ] Single inheritance
- [ ] Multilevel inheritance
- [ ] Hierarchical inheritance
- [ ] `super()` constructor chaining
- [ ] Method overriding
- [ ] `protected` members
- [ ] `final` method

**Abstraction**
- [ ] Abstract class with one abstract method
- [ ] Abstract class mixing concrete + abstract methods
- [ ] Abstract class constructors
- [ ] Array of abstract-type references (polymorphism)
- [ ] Template method pattern (`final` method calling abstract steps)
- [ ] Multiple abstract methods in one class
- [ ] Abstract class vs subclass responsibility split

**Encapsulation**
- [ ] Private fields with getters/setters
- [ ] Validated setters
- [ ] Read-only (`final`) fields
- [ ] Private array fields with computed accessors
- [ ] Encapsulation with composition (object-within-object)
- [ ] Immutable classes
- [ ] Private helper methods

**Polymorphism**
- [ ] Method overloading (compile-time)
- [ ] Method overriding (runtime)
- [ ] Constructor overloading
- [ ] `toString()` override
- [ ] `equals()` override
- [ ] Dynamic method dispatch
- [ ] Upcasting / downcasting with `instanceof`

**Interfaces**
- [ ] Basic interface implementation
- [ ] Multiple interface implementation
- [ ] `default` methods
- [ ] `static` methods
- [ ] Interface extending interface
- [ ] Interface reference polymorphism
- [ ] Interface constants (`public static final`)

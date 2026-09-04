import java.util.*;

class Person {
    String name;
    int age;

    Person() {
        this.name = "unknown";
        this.age = 0;  
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String details() {
        return name + " " + age;
    }
}

class Result {
    static String getDetails(int type, String name, int age) {
        if (type == 1) {
            Person p = new Person(name, age);
            return p.details();
        }
        Person p = new Person();
        return p.details();
    }
}

class Seven {
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
        s.close();
    }
}
import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Result {
    static String oldestPerson(Person[] people) {
        Person old = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].age > old.age) {
                old = people[i];
            }
        }
        return old.name;
    }
}

class Eleven {
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
        s.close();
    }
}
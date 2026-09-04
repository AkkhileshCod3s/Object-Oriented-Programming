import java.util.*;

class Car {
    String brand;
    int year;

    Car() {
        this.brand = "unkown";
        this.year = 0;
    }

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String details() {
        return brand + " " + year;
    }
}

class Result {
    static String carDetails(int type, String brand, int year) {
        if (type == 1) {
            Car car = new Car(brand, year);
            return car.details();
        }
        Car car = new Car();
        return car.details();
    }
}

class Six {
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
        s.close();
    }
}
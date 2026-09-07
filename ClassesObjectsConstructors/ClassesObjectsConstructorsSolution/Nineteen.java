import java.util.*;

class Temperature {
    double celsius;

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}

class Result {
    static double convert(double celsius) {
        Temperature t = new Temperature(celsius);
        return t.toFahrenheit();
    }
}

class Nineteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double celsius = s.nextDouble();

        System.out.println(Result.convert(celsius));
        s.close();
    }
}
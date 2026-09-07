import java.util.*;

class Time {
    int hours;
    int minutes;

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}

class Result {
    static Time addTime(Time t1, Time t2) {
        int totalMinutes = t1.minutes + t2.minutes;
        int extraHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;
        int finalHours = t1.hours + t2.hours + extraHours;

        return new Time(finalHours, finalMinutes);
    }
}

class Fourteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        Time t1 = new Time(s.nextInt(), s.nextInt());
        Time t2 = new Time(s.nextInt(), s.nextInt());

        Time result = Result.addTime(t1, t2);

        System.out.println(result.hours + " " + result.minutes);
        s.close();
    }
}
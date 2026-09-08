import java.util.*;

class Result {
    static double average(ArrayList<Integer> list, int N) {
        double avg = 0;
        int sum = 0;
        for (Integer num : list) {
            sum += num;
            avg = sum / list.size();
        }
        return avg;
    }
}

class Four {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.average(list, N));
        s.close();
    }
}
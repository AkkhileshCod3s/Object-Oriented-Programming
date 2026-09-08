import java.util.*;

class Result {
    static long sumElements(ArrayList<Integer> list, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

class Three {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.sumElements(list, N));
        s.close();
    }
}
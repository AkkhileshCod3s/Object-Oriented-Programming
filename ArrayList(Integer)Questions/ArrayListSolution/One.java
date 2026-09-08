import java.util.*;

class Result {
    static int maxElement(ArrayList<Integer> list, int N) {
        int max = list.get(0);
        for (int i = 0; i < N; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}

class One {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.maxElement(list, N));
        s.close();
    }
}
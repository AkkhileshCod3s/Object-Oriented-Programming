import java.util.*;

class Result {
    static int minElement(ArrayList<Integer> list, int N) {
        int min = list.get(0);
        for (int i = 0; i < N; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
}

class Two {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.minElement(list, N));
        s.close();
    }
}
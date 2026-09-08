import java.util.*;

class Result {
    static String countEvenOdd(ArrayList<Integer> list, int N) {
        int oddCount = 0;
        int evenCount = 0;
        for (Integer num : list) {
            if (num % 2 != 0) {
                oddCount++;
            }
            else {
                evenCount++;
            }
        }
        return evenCount + " " + oddCount;
    }
}

class Five {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        System.out.println(Result.countEvenOdd(list, N));
        s.close();
    }
}
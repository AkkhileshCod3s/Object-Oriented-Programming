import java.util.*;

class Result {
    static int countOccurrences(ArrayList<Integer> list, int target) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                count++;
            }
        }
        return count;
    }
}

class Nine {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.countOccurrences(list, target));
        s.close();
    }
}
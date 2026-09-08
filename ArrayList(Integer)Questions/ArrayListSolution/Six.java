import java.util.*;

class Result {
    static boolean search(ArrayList<Integer> list, int target) {
        for (Integer num : list) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

class Six {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.search(list, target));
        s.close();
    }
}
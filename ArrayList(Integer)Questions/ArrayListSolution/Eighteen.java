import java.util.*;

class Result {
    static ArrayList<Integer> sortDescending(ArrayList<Integer> list) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            a.add(list.get(i));
        }
        return a;
    }
}

class Eighteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.sortDescending(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
        s.close();
    }
}
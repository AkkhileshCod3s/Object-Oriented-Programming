import java.util.*;

class Result {
    static ArrayList<Integer> removeAll(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                list.remove(i);
            }
        }
        return list;
    }
}

class Eleven {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        ArrayList<Integer> result = Result.removeAll(list, target);

        for (int value : result) {
            System.out.print(value + " ");
        }
        s.close();
    }
}
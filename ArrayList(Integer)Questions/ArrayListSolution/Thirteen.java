import java.util.*;

class Result {
    static ArrayList<Integer> findOdd(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
        list.clear();
        return list;
    }
}

class Thirteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.findOdd(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
        s.close();
    }
}
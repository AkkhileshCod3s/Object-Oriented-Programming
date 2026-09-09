import java.util.*;

class Result {
    static ArrayList<Integer> sortAscending(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }
}

class Seventeen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.sortAscending(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
        s.close();
    }
}
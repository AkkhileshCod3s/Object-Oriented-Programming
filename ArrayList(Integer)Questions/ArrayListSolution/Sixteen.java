import java.util.*;

class Result {
    static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> rev = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            rev.add(list.get(i));
        }
        return rev;
        
        // Or

        // Collections.reverse(list);
        // return list;
    }
}

class Sixteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.reverseList(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
        s.close();
    }
}
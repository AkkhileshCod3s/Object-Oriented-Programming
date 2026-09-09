import java.util.*;

class Result {
    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
}

class Fourteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        ArrayList<Integer> result = Result.removeDuplicates(list);

        for (int value : result) {
            System.out.print(value + " ");
        }
        s.close();
    }
}
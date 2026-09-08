import java.util.*;

class Result {
    static int firstOccurrence(ArrayList<Integer> list, int target) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                index = i;
                break; // stops at first occurence
            }
        }
        return index;
    }
}

class Seven {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }

        int target = s.nextInt();

        System.out.println(Result.firstOccurrence(list, target));
        s.close();
    }
}
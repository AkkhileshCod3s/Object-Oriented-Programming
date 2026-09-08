import java.util.*;

public class ThirtyTwo {

    static void partition(ArrayList<Integer> list) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (Integer num : list) {
            if (num > 0) {
                a.add(num);
            }
            if(num <= 0) {
                c.add(num);
            }
        }
        list.clear();
        list.addAll(c);        
        list.addAll(a);        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        partition(list);
        System.out.println(list);
        sc.close();
    }
}

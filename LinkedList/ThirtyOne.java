import java.util.*;

public class ThirtyOne {

    static void removeDuplicates(LinkedList<String> list) {
        LinkedList<String> a = new LinkedList<>();
        for(String str : list){
            if(!a.contains(str)){
                a.add(str);
            }
        }
        list.clear();
        for(String str : a){
            list.add(str);
        }

    }

    static String longest(LinkedList<String> list) {
        String emp = "";
        for (String str : list) {
            if (str.length() > emp.length()) {
                emp = str;
            }
        }
        return emp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < n; i++)
            list.add(sc.next());

        removeDuplicates(list);
        System.out.println(list);
        System.out.println(longest(list));
        sc.close();
    }
}

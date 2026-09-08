import java.util.Scanner;
class One
{
    static String capitalizeFirstChar(String str)
    {
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.println(capitalizeFirstChar(s));
        }
        sc.close();
    }
}
import java.util.Scanner;

public class My_very_1st_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] org = str.split(" ");
        int N = Integer.parseInt(org[0]);
        int A = Integer.parseInt(org[1]);
        int B = Integer.parseInt(org[2]);
        int X = A+B;
        int a1 = N-A;
        int a2 = N-X;
        System.out.println(a1 + " " + a2);
    }
}

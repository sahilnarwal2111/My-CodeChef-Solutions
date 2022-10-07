import java.util.Scanner;

public class Passing_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int aMin = sc.nextInt();
            int bMin = sc.nextInt();
            int cMin = sc.nextInt();
            int tMin = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int total = a + b + c;
            if(a>=aMin && b>=bMin && c>=cMin && total>=tMin){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

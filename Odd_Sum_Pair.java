import java.util.Scanner;

public class Odd_Sum_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sumAB = 0, sumBC = 0, sumAC =0;
            sumAB = a + b;
            sumBC = b + c;
            sumAC = a + c;
            if(sumAB % 2 !=0 || sumBC % 2 !=0 || sumAC % 2 !=0){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }
    }
}

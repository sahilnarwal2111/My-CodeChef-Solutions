import java.util.Scanner;

public class Chef_and_spells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int minP1 = Math.min(a,b);
            int minP2 = Math.min(b,c);
            int minF = Math.min(minP1, minP2);
            int answer = a + b + c - minF;
            System.out.println(answer);
        }
    }
}

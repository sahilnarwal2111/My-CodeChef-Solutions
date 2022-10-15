import java.util.Scanner;

public class Weight_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            int w1,w2,x1,x2,m;
            w1 = sc.nextInt();
            w2 = sc.nextInt();
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            m = sc.nextInt();
            int minW = x1*m;
            int maxW = x2*m;
            int diff = w2-w1;
            if(diff>=minW && diff<=maxW) System.out.println(1);
            else System.out.println(0);
        }
    }
}

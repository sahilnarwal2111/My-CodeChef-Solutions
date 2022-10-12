import java.util.Scanner;

public class Slow_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();
            int T;
            T = sumN/maxN;
            int S = sumN%maxN;
            int Sqr = maxN*maxN;
            if(T>maxT){
                Sqr*=maxT;
            }
            else {
                Sqr *= T;
                if(T+1<=maxT)
                    Sqr+=S*S;
            }
            System.out.println(Sqr);
        }

    }
}

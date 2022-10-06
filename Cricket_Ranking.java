import java.util.Scanner;

public class Cricket_Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count1 = 0;
            int count2 = 0;
            int r1 = sc.nextInt();
            int w1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int w2 = sc.nextInt();
            int c2 = sc.nextInt();
            if(r1>r2) {
                count1++;
            }
            else {
                count2++;
            }
            if(w1>w2) {
                count1++;
            }
            else {
                count2++;
            }
            if(c1>c2) {
                count1++;
            }
            else {
                count2++;
            }
            if(count1>count2){
                System.out.println("A");
            }
            else System.out.println("B");
        }
    }
}

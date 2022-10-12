import java.util.Scanner;

public class Chess_Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int  b= sc.nextInt();
            int total_Time_After_N_Turns = 2*(180 + n);
            System.out.println(total_Time_After_N_Turns-a-b);

        }
    }
}

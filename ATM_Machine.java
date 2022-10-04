import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t ; i++){
            String str = sc.nextLine();
//            sc.nextLine();
            String amt = sc.nextLine();

            String[] strNK = str.split(" ");
            int N = Integer.parseInt(strNK[0]);
            String[] N_amt = amt.split(" ");
            int K = Integer.parseInt(strNK[1]);
            int[] amount = new int[N];
            for(int j = 0; j < N; j ++){
                amount[j] = Integer.parseInt(N_amt[j]);
            }
            for(int k = 0 ; k< N; k++){
                if(amount[k]<= K){
                    K = K - amount[k];
                    System.out.print("1");
                }
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}

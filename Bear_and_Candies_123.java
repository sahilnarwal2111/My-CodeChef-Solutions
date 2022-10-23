import java.util.Scanner;

public class Bear_and_Candies_123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            int L = 0,B =0;
            for(int i = 1;i<=(a+b) ;i++){
                // L and B have not to be increased in every instead
                //they should be in alternative manner
                if(i%2==0){
                    B = B + i;
                }
                else L = L +i;
                if(L>a) {
                    System.out.println("Bob");
                    break;
                }else if(B>b){
                    System.out.println("Limak");
                    break;
                }
            }
        }
    }
}

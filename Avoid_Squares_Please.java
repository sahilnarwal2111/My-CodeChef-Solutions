import java.util.Scanner;

public class Avoid_Squares_Please {
    public static int factorial(int n){
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int [] arr = new int[n];
            for(int i =0 ; i< arr.length; i++){
                arr[i] = i+1;
            }
            System.out.println(factorial(5));
            for(int i = 0 ; i<factorial(n); i++){
                
            }
        }
    }
}

import java.util.Scanner;

public class Minimum_OR_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i< n ; i++) arr[i] = sc.nextInt();
            int count = 0;
            for(int i = 0 ; i< n; i++){
                if(arr[i] == 1) count++;
            }
            if(count>=2) System.out.println(1);
            else System.out.println(0);
        }
    }
}

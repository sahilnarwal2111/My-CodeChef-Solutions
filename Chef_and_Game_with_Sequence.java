import java.util.Scanner;

public class Chef_and_Game_with_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            /*
            e = 2 o = 2 --> even + even = e
            e = 2 o = 3 --> even + odd = odd
            e = 3 o = 3 --> even + odd = odd
            e = 3 o = 2 --> even + even = e
             */
            int evenCount =0, oddCount = 0;
            for(int i = 0; i<n; i++){
                if(arr[i]%2==0) evenCount++;
                else if(arr[i]!=0) oddCount++;
            }
            if(n==1) System.out.println(1);
            else if(oddCount%2!=0) System.out.println(2);
            else System.out.println(1);
        }

    }
}

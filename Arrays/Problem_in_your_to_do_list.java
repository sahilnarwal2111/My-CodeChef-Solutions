package Arrays;

import java.util.Scanner;

public class Problem_in_your_to_do_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int x: arr){
                if(x>=1000) count++;
            }
            System.out.println(count);
        }
    }
}

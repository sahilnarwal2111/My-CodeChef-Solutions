import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ups_and_Downs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(n);
            for(int i=0; i<n; i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            for(int i=1; i<arr.size()-1; i+=2){
                Collections.swap(arr,i,i+1);
            }
            for(int x : arr){
                System.out.print(x + " ");
            }
        }
    }
}

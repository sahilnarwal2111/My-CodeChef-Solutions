import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Covert_to_permutation {
    //Every element needs to between 0 and n
    //Max 2 same element's
    //int(



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i< n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int totalSumShouldBe =  (n*(n+1))/2;
            int actualSum =0;
            boolean bound = true;
            for(int i = 0 ; i< n; i++){
                if(arr[i]>i+1){
                    bound = false;
                    break;
                }
                actualSum+=arr[i];
            }
            if(!bound){
                System.out.println("-1");
            }
            else {
                System.out.println(totalSumShouldBe-actualSum);
            }
        }
    }
}

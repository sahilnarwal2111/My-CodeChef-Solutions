import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class Degree_of_Polynomial {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int [] arr = new int[n];
            for(int i = 0 ; i< n ; i++){
                arr[i] = sc.nextInt();
            }
            boolean f = true;
            int i  = n-1;
            while(f){
                if(arr[i]!=0){
                    System.out.println(i);
                    f = false;
                    break;
                }
                else i--;
            }

        }
    }
}

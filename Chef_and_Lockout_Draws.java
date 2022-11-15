import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chef_and_Lockout_Draws {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Integer [] a = new Integer[3];
            for(int i = 0; i<3; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            if(a[0] == a[0] + a[1]){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }

    }
}

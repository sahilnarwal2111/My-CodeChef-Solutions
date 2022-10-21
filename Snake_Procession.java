import java.util.Objects;
import java.util.Scanner;

public class Snake_Procession {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- !=0){
            int flag = 1;
            int count = 0;
            int n = sc.nextInt();
            String str = sc.next();
            for(int i = n-1 ; i>=0; i--){
                if(str.charAt(i) == 'T') count++;
                else if(str.charAt(i) == 'H') {
                    if(str.charAt(i)=='H' && count==0 || count >=2){
                        flag = 0;
                        break;
                    }
                    else count--;
                }

            }
            if(flag==1 || count==0) System.out.println("INVALID");
            else System.out.println("VALID");

        }
    }
}
/*
6
18
..H..T...HTH....T.
3
...
10
H..H..T..T
2
HT
11
.T...H..H.T
7
H..T..H
 */
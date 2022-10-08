package String;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String S = sc.next();
            String T = sc.next();
            StringBuilder M = new StringBuilder();
            for(int i = 0 ; i<5 ; i++){
                if(T.charAt(i) == S.charAt(i)){
                    M.append("G");
                }else M.append("B");
            }
            System.out.println(M);
        }
    }
}

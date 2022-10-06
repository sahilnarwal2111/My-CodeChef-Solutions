import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Chef_and_Happy_String {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.next();
            int count = 0;
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                || str.charAt(i) == 'i') {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }else {
                    count = 0;
                }
                }
            if(count>2){
                System.out.println("Happy");
            }
            else System.out.println("Sad");
        }
    }
}

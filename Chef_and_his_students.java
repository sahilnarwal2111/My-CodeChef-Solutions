import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Chef_and_his_students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            Pattern pattern = Pattern.compile("<>");
            Matcher matcher = pattern.matcher(str);
            int count = 0;
            while(matcher.find()) count++;
            System.out.println(count);
        }
    }
}

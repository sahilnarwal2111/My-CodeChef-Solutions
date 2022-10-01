import java.util.Scanner;

public class Malvika_is_peculiar_about_color_of_balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 3;
        String str1 = "ab";
        int a1 = 0;
        int b1 = 0;
        for(int j = 0; j < str1.length(); j++ ){
            if(str1.charAt(j) == 'a'){
                a1++;
            }
            else b1++;
        }
        System.out.println(Math.min(a1,b1));
        String str2 = "bb";
        int a2 = 0;
        int b2 = 0;
        for(int j = 0; j < str2.length(); j++ ){
            if(str2.charAt(j) == 'a'){
                a2++;
            }
            else b2++;
        }
        System.out.println(Math.min(a2,b2));
        String str3 = "baaba";
        int a3 = 0;
        int b3 = 0;
        for(int j = 0; j < str3.length(); j++ ){
            if(str3.charAt(j) == 'a'){
                a3++;
            }
            else b3++;
        }
        System.out.println(Math.min(a3,b3));
    }
}

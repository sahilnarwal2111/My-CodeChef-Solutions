//import java.util.Scanner;
//import java.util.Arrays;
//public class Encoding_Message {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            String str = sc.next();
//            String [] s = str.split("");
//            for(int i =0; i<n; i++){
//                String t;
//                if(n%2!=0) {
//                    if (i == n - 1) s[i] = s[i];
//
//                    else {
//                        t = s[i];
//                        s[i] = s[i + 1];
//                        s[i + 1] = t;
//                    }
//                }
//                else {
//                    t = s[i];
//                    s[i] = s[i+1];
//                    s[i+1] = t;
//                }
//
//            }
//
//        for(int i =0; i<n; i++){
//            if(s[i] == "z") s[i] = "a";
////            else s[i] = char((int)s[i] + 2*(110-(int)s[i])-1)
//        }
//        }
//    }
//
//}

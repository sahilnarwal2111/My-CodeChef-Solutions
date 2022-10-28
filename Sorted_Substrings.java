import java.util.Scanner;


public class Sorted_Substrings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           String str = sc.next();
           char [] a = str.toCharArray();
           int count = 0;
           for(int i = 0 ; i < n;){
               if(a[i] == '1'){
                   i++;
                   int c = 0;
                   while(i<n&&a[i]=='0'){
                       i++;
                       c++;
                   }
                   if(c>0){
                       count++;
                   }
               }
               else{
                   i++;
               }
           }
           System.out.println(count);
       }
    }
}

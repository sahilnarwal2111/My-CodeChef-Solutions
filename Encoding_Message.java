import java.util.Scanner;
import java.util.Arrays;
public class Encoding_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            String[] arr = str.split("");
            int index = n/2 ;
            for(int i = 0; i < index; i++){
                String temp = null;
                temp = arr[2*i];
                arr[2*i] = arr[2*i + 1];
                arr[2*i + 1] = temp;
            }
            str = Arrays.toString(arr);
            StringBuilder sb = new StringBuilder();
            for(String element: arr){
                sb.append(element);
            }
            str = sb.toString();
            char [] ch = str.toCharArray();
            for(int i = 0; i< n; i++) {
                int x = ch[i];
                ch[i] = (char) (219-x);
            }
            for(int i = 0; i<n; i++) System.out.print(ch[i]);

        }
    }

}

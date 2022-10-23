import java.util.Scanner;

public class Chef_and_Two_Strings {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tc = sn.nextInt();
        while(tc-->0){
            String a = sn.next();
            String b = sn.next();
            int qA = 0, qB =0;
            for(int i =0; i< a.length(); i++){
                if(a.charAt(i) == '?') qA++;
                if(b.charAt(i) == '?') qB++;
            }
            int finalQ = (int) Math.max(qA,qB);
            int same = 0;
            for(int i =0; i< a.length(); i++){
                if(a.charAt(i) != '?' || b.charAt(i) != '?'){
                    if(a.charAt(i) == b.charAt(i)) same++;
                }
            }
            int max = same + finalQ;
            int min = same ;
            System.out.print(min+ " ");
            System.out.println(max);
        }
    }
}

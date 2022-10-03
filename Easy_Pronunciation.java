import java.util.Scanner;

public class Easy_Pronunciation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int j = 0 ; j < t ; j++) {
            int N = sc.nextInt();
            sc.nextLine();
            String st = sc.nextLine();
            int count = 0;

            for(int i = 0 ; i< st.length(); i++){
                if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
                    count = 0;
                    continue;
                }
                else count ++;
                if(count >= 4){
                    break;
                }
            }
            if(count >= 4){
                System.out.println("NO");
            }
            else System.out.println("YES");

        }
    }
}

import java.util.Scanner;

public class Chef_gives_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] xyz = str.split(" ");
            int n = Integer.parseInt(xyz[0]);
            int x = Integer.parseInt(xyz[1]);
            int k = Integer.parseInt(xyz[2]);
            int bill = n*x;
            if(bill<=k){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

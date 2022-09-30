import java.util.Scanner;

public class Apple_and_Oranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String xy[] = str.split(" ");
        int a = Integer.parseInt(xy[0]);
        int b = Integer.parseInt(xy[1]);
        if(x>=(a+b)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

import java.util.Scanner;

public class Chef_and_Cook_Off {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int total = a + b + c + d + e;
            switch (total) {
                case 0 -> System.out.println("Beginner");
                case 1 -> System.out.println("Junior Developer");
                case 2 -> System.out.println("Middle Developer");
                case 3 -> System.out.println("Senior Developer");
                case 4 -> System.out.println("Hacker");
                case 5 -> System.out.println("Jeff Dean");
                default -> System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class Ada_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[2];
        for(int i = 0; i < t ; i++){
            String str = sc.nextLine();
            String[] num = str.split(" ");
            arr[0] = Integer.parseInt(num[0]);
            arr[1] = Integer.parseInt(num[1]);
            if(arr[0] % 2 == 0 || arr[1] % 2 == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

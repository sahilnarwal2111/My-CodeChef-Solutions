import java.util.Scanner;

public class Best_of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i< T; i++ ){
            String str = sc.nextLine();
            String[] XY = str.split(" ");
            int X = Integer.parseInt(XY[0]);
            int Y = Integer.parseInt(XY[1]);
            System.out.println(Math.max(X, Y));
        }
    }
}

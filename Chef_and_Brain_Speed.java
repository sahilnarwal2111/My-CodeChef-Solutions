import java.util.Scanner;

public class Chef_and_Brain_Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] xy = str.split(" ");
        int x = Integer.parseInt(xy[0]);
        int y = Integer.parseInt(xy[1]);
        if(x>=y){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}

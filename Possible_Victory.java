import java.util.Scanner;

public class Possible_Victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int o = sc.nextInt();
        int c = sc.nextInt();
        int runsMax = (20-o)*6*6;
        int target = r-c;
        if(target<=runsMax) System.out.println("yes");
        else System.out.println("no");
    }
}

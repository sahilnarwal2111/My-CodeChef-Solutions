import java.util.Scanner;

public class Playing_with_matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int j = 0 ; j <t ; j++ ){
            String str = sc.nextLine();
            String xy[] = str.split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            int sum = x + y;
            String sumStr = String.valueOf(sum);
            int count = 0;
            for (int i = 0; i < sumStr.length(); i++) {
                switch (sumStr.charAt(i)) {
                    case '0', '6', '9' -> count = count + 6;
                    case '1' -> count = count + 2;
                    case '2', '3', '5' -> count = count + 5;
                    case '4' -> count = count + 4;
                    case '7' -> count = count + 3;
                    case '8' -> count = count + 7;
                }
            }
            System.out.println(count);
        }
    }
}

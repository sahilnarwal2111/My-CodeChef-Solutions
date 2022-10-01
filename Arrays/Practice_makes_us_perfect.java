package Arrays;

import java.util.Scanner;

public class Practice_makes_us_perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        String str = sc.nextLine();
        String abcd[] = str.split(" ");
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(abcd[i]);
        }
        int count = 0;
        for(int x: arr){
            if(x>=10){
                count++;
            }
        }
        System.out.println(count);
    }
}

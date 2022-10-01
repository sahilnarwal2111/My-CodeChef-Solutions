package Arrays;

import java.util.Scanner;

public class Lucky_Four {
    public static void main(String[] args) {
        // your code goes here
        int t=4;
        Scanner sc = new Scanner(System.in);
        // t = sc.nextInt();
        // sc.nextLine();
        int[] arr = {447474,228,6664,40,81};
        int[] res = new int[t];
        for (int i = 0; i < t; i++) {
            res[i] = 0;
        }
        // for (int i = 0; i < t; i++) {
        //     arr[i] = sc.nextInt();
        //     sc.nextLine();
        // }
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == '4') {
                    res[i]++;
                }
            }
        }
        for (int x : res) {
            {
                System.out.println(x);
            }

        }
    }
}

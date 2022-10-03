package Binary_Search;

import java.util.Scanner;

public class The_Attack_of_Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){

            String str = sc.nextLine();
            String nxy[] = str.split(" ");
            int N = Integer.parseInt(nxy[0]);
            int X = Integer.parseInt(nxy[1]);
            int Y = Integer.parseInt(nxy[2]);
            int count = 2*N-2;
            int x1 = X, x2 = X, x3 = X, x4 = X;
            int y1 = Y, y2 = Y, y3 = Y, y4 = Y;
//            Case-1 i++;j++
            while(x1<N && y1<N){
                x1++;
                y1++;
                count++;
            }
            //Case-2 i--;j--
            while(x2>1 && y2>1){
                x2--;
                y2--;
                count++;
            }
            //Case-3 i++;j--
            while(x3<N && y3>1){
                x3++;
                y3--;
                count++;
            }
            //Case-4 i--;j++
            while(x4>1 && y4<N){
                x4--;
                y4++;
                count++;
            }
            System.out.println(count);
            count = 0;
            }


        }

}

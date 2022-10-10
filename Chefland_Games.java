import java.util.Scanner;

public class Chefland_Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int arr[] = new int[4];

            for(int i =0;i<4;i++){
                arr[i] = Integer.parseInt(s[i]);
            }

            if(arr[0]==1&&
                    arr[1]==1&&
                    arr[2]==1&&
                    arr[3]==1){
                System.out.println("in");
            }
            else System.out.println("out");
        }
    }
}

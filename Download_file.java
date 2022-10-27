import java.util.Scanner;

public class Download_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int totalMB = 0;
            for(int i = 0; i < n ; i++){
                int t=sc.nextInt();
                int d=sc.nextInt();
                if(t<k)
                {
                    k=k-t;
                    t=0;
                }
                else
                {
                    t=t-k;
                    k=0;
                }
                totalMB+=d*t;
            }
            System.out.println(totalMB);



        }
    }
}

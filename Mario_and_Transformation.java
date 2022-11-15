import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mario_and_Transformation {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int x  = Integer.parseInt(br.readLine());
            if(x % 3 == 0) System.out.println("NORMAL");
            else if(x % 3 == 1) System.out.println("HUGE");
            else System.out.println("SMALL");

        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class Recent_contest_problems {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] splited = str.split("\\s+");
            int count_38 = 0;
            int count_108 = 0;
            for(int i = 0 ; i<splited.length; i++) {
                if (splited[i].equals("START38")) count_38++;
                else count_108++;
            }
            System.out.println(count_38 + " " + count_108);
        }

    }
}

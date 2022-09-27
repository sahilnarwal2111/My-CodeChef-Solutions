import java.util.Scanner;

public class Alice_Marks {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String new1 = sc.nextLine();
        String[] marks = new1.split(" ");
        int X;
        int Y;
        X = Integer.parseInt(marks[0]);
        Y = Integer.parseInt(marks[1]);
        if(X>=2*Y){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}

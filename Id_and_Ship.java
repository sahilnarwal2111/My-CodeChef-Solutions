import java.util.Scanner;

public class Id_and_Ship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char a = sc.next().charAt(0);
            switch (a) {
                case 'b', 'B' -> System.out.println("BattleShip");
                case 'c', 'C' -> System.out.println("Cruiser");
                case 'D', 'd' -> System.out.println("Destroyer");
                case 'F', 'f' -> System.out.println("Frigate");
            }
        }
    }
}

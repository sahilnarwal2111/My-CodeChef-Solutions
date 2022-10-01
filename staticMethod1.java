public class staticMethod1 {
    static int count = 0;
    staticMethod1(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
           staticMethod1 sm1 = new staticMethod1();
           staticMethod1 sm2 = new staticMethod1();
           staticMethod1 sm3 = new staticMethod1();

    }
}

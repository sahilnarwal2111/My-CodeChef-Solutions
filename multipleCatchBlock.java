public class multipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 30 / 0;
        }
//        catch (Exception e){
//            System.out.println("Most General!");
//        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Most General!");
        }
    }
}

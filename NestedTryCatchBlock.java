public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Going to divide by 0");
                int t = 9/0;
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException");
            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//            }
            try{
                int [] arr = new int[5];
                arr[5] = 4;
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println("Finally last catch block!");
        }

    }
}

public class exceptionPropagation {
    void m(){
        int d = 2/0;
    }
    void n(){
        m();
    }
    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        exceptionPropagation ep = new exceptionPropagation();
        ep.p();
        System.out.println("Rest of code goes from here!");
    }
}

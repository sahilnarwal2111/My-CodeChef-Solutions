public class this03 {
    void m(this03 obj){
        System.out.println("Method is invoked!!");
    }
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        this03 t1 = new this03();
        t1.p();
    }
}

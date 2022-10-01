class B{
    this04 t4 ;
    B(this04 t4){
        this.t4 = t4;
    }
    void display(){
        System.out.println(t4.data);
    }
}

public class this04 {
    int data = 4;
    this04(){
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args) {
        this04 a = new this04();
    }
}

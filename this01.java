public class this01 {
    int rollno;
    String name;
    float fee;
    this01(int rollno, String name, float fee){
//        rollno = rollno;
//        name = name;
//        fee = fee;
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }

    public static void main(String[] args) {
        this01 t1 = new this01(23, "Sahil ", 6000);
        t1.display();
    }
}

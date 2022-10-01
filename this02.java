//Using this to call the constructor ie invoking
public class this02 {
    int rollno;
    String name;
    float fee;
    String course;
    this02(int rollno, String name, float fee){
        this.fee = fee;
        this.name = name;
        this.rollno = rollno;
    }
    this02(int rollno, String name, float fee, String course){
        this(rollno,name,fee);
        this.course = course;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + fee + " " + course);
    }

    public static void main(String[] args) {
        this02 t1 = new this02(23,"Sahil",23000);
        this02 t2 = new this02(23,"Sahil",23000, "Btech");
        t1.display();
        t2.display();
    }
}

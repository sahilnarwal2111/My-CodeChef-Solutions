class Person{
    int id;
    String name;
    float salary;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Employee extends Person{
    Employee(int id, String name, float salary){
        super(id,name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

public class superRealUse {
    public static void main(String[] args) {
        Employee e1 = new Employee(233,"Sahil",300000);
        e1.display();
    }
}

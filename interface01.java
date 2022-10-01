interface CarStart{
    void start();
}
interface CarStop{
    void stop();
}
public class interface01 implements CarStart, CarStop {
    public void start(){
        System.out.println("Car is starting!");
    }
    public void stop(){
        System.out.println("Car is stoping!");
    }

    public static void main(String[] args) {
        interface01 i = new interface01();
        i.start();
        i.stop();
    }
}

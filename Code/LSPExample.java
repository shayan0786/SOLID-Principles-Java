package Code;
import javax.management.RuntimeErrorException;
class Bird{
    void fly(){
        System.out.println("Flying...1");
    }
}
class Penguin extends Bird{
    void fly(){
        throw new RuntimeErrorException(null, "Can not fly");//This crash the code 
    }
}
interface Flyable{
    void fly1();
}
class Sparrow implements Flyable{
    public void fly1(){
        System.out.println("Flying....");
    }
}
class Penguin1{
    void swim(){
        System.out.println("Swiming....");
    }
}
public class LSPExample {
    public static void main(String[] args) {
        Flyable f = new Sparrow();
        f.fly1();
        Penguin1 p = new Penguin1();
        p.swim();
        Bird b = new Penguin();
        b.fly(); // crash the code because it can not use it ,methods prioperly
    }
}
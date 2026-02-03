package Code;
interface Operation{
    double calculate(double a,double b);
}
class Add implements Operation{
    public double calculate(double a,double b){
        return a+b;
    }
}
class Sub implements Operation{
    public double calculate(double a,double b){
        return a-b;
    }
}
class Calculator{
    public double calculate(Operation op,double a,double b){
        return op.calculate(a, b);
    }
}
public class OCPExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Add add = new Add(); 
        System.out.println(cal.calculate(add, 10, 85));
    }
}

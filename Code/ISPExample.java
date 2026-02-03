package Code;
// Good ISP here we see different interface for different use only
interface Printable{
    void print();
}
interface Scanable{
    void scan();
}
interface Faxable{
    void fax();
}
class SimplePrinter implements Printable {
    public void print(){
        System.out.println("Printing......");
    }
}
class AllInOnePrinter implements Printable ,Scanable ,Faxable{
    public void print(){
        System.out.println("Printing...... all in one...");
    }
    public void scan(){
        System.out.println("Scan....");
    }
    public void fax(){
        System.out.println("Fax...");
    }
}
public class ISPExample {
    public static void main(String[] args) {
        Printable p = new SimplePrinter();
        p.print();
        AllInOnePrinter all = new AllInOnePrinter();
        all.print();
        all.scan();
        all.fax();
    }
}

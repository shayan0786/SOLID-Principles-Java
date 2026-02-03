package Code;
class ReportGenerate{
    void genrateReport(){
        System.out.println("Genrate...");
    }
}
class ReportPrint{
    void printReportr(){
        System.out.println("Print.....");
    }
}
class ReportSave{
    void saveToFile(){
        System.out.println("Save.....");
    }
}
public class SRPExample {
    public static void main(String[] args) {
        ReportGenerate rg = new ReportGenerate();
        ReportPrint rp = new ReportPrint();
        ReportSave rs = new ReportSave();
        rg.genrateReport();
        rp.printReportr();
        rs.saveToFile();
    }
}
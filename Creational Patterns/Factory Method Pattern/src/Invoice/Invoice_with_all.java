package Invoice;

public class Invoice_with_all implements Invoice {
    String Itype;
    Invoice_with_all(){
        Itype = "Invoice With All.";
    }
    public String getItype() {
        return Itype;
    }

}

package Invoice;

public class Invoice_without_all implements Invoice {
    String Itype;
    Invoice_without_all(){
        Itype = "Invoice without all";
    }
    public String getItype() {
        return Itype;
    }
}

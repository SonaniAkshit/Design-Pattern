package Invoice;

public class Invoice_with_header implements Invoice{
    String Itype;
    Invoice_with_header(){
        Itype = "Invoice With Header";
    }
    public String getItype() {
        return Itype;
    }
}

package Invoice;

public class Invoice_without_footer_with_header implements Invoice{
    String Itype;
    Invoice_without_footer_with_header(){
        Itype = "Invoice without footer with header";
    }
    public String getItype() {
        return Itype;
    }
}

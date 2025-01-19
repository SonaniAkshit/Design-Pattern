package Invoice;

public class Invoice_without_header_with_footer implements Invoice{
    String Itype;
    Invoice_without_header_with_footer(){
        Itype = "Invoice without header with footer";
    }
    public String getItype() {
        return Itype;
    }
}

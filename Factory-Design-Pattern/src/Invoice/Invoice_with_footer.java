package Invoice;

public class Invoice_with_footer implements Invoice {
    String Itype;
    Invoice_with_footer() {
        Itype = "Invoice with footer";
    }
    public String getItype() {
        return Itype;
    }
}

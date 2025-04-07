package Invoice;

public class InvoiceFactory {
    public static Invoice getInvoice(int choice) {
        Invoice I = null;
        switch (choice) {
            case 1:
                I = new Invoice_with_all();
                break;
            case 2:
                I = new Invoice_with_header();
                break;
            case 3:
                I = new Invoice_with_footer();
                break;
            case 4:
                I = new Invoice_without_all();
                break;
            case 5:
                I = new Invoice_without_header_with_footer();
                break;
            case 6:
                I = new Invoice_without_footer_with_header();
                break;
        }
        return I;
    }
}


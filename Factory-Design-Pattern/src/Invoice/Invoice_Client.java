package Invoice;

import java.util.Scanner;

public class Invoice_Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Invoice invoice;
        int choice;
        choice = sc.nextInt();

        invoice = InvoiceFactory.getInvoice(choice);

        System.out.println(invoice.getItype());
    }
}

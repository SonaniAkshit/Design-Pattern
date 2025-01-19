package Invoice;

import java.util.Scanner;

public class Invoice_Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Invoice invoice;
            int choice;
            System.out.println("\n****menu****\n1)Invoice with all\n2)Invoice with header\n3)Invoice with footer\n4)Invoice without all\n5)Invoice without footer with header\n6)Invoice without header with footer\n0 for Exit\n************\n");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            invoice = InvoiceFactory.getInvoice(choice);

            if (invoice != null) {
                System.out.println(invoice.getItype());
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

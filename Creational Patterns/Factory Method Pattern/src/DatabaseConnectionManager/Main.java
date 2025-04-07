package DatabaseConnectionManager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            iDatabaseConnection DBC;
            int choice;
            int choice2;
            System.out.println("\n1)MySQL Connection.\n2)PostgreSQL Connection\n3)MongoDBConnection\n0 For Exit");
            choice = sc.nextInt();
            if(choice == 0){
                System.out.println("Exiting...");
                break;
            }

            DBC = DatabaseFactory.getDatabaseConnection(choice);

            if(DBC != null){
                System.out.println("\n1)Connect.\n2)Query.\n3)Disconnect.\n0 For Exit");
                choice2 = sc.nextInt();
                if(choice2 == 0) {
                    System.out.println("Exiting...");
                    break;
                } else if (choice2 == 1) {
                    System.out.println(DBC.connect());
                }else if(choice2 == 2){
                    System.out.println(DBC.query());
                }else if(choice2 == 3){
                    System.out.println(DBC.disconnect());
                }else{
                    System.out.println("Error: Invalid choice. Try again.");
                }

            }
            else{
                System.out.println("Error: Invalid choice. Try again.");
            }

        }

    }
}

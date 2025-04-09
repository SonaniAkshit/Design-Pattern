package StudentDatabaseConnectionManager;

public class Main {
    public static void main(String[] args) {
        // Getting the only instance of DatabaseConnection
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM students");

        // Getting the same instance again
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM courses");

        // Check if both are the same object
        System.out.println("Are both connections same? " + (db1 == db2));  // true
    }
}

package StudentDatabaseConnectionManager;

public class DatabaseConnection {
    // Step 1: Create a private static instance
    private static DatabaseConnection instance;

    // Step 2: Private constructor so no one can create object directly
    private DatabaseConnection() {
        System.out.println("Database connected.");
    }

    // Step 3: Public static method to provide access to the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // only one instance created
        }
        return instance;
    }

    // Example method
    public void query(String sql) {
        System.out.println("Running query: " + sql);
    }
}

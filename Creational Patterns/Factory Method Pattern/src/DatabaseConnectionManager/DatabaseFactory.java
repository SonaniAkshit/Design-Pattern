package DatabaseConnectionManager;

public class DatabaseFactory {
    public static iDatabaseConnection getDatabaseConnection(int choice) {
        iDatabaseConnection DBC = null;
        switch (choice) {
            case 1: DBC = new MySQLConnection();
                break;
            case 2: DBC = new PostgreSQLConnection();
                break;
            case 3: DBC = new MongoDBConnection();
                break;
        }
        return DBC;
    }
}

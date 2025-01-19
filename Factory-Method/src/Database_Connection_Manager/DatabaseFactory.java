package Database_Connection_Manager;

public class DatabaseFactory {
    public static DatabaseConnection getDatabaseConnection(int choice) {
        DatabaseConnection DBC = null;
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

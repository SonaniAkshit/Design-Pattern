package Database_Connection_Manager;

public class PostgreSQLConnection implements DatabaseConnection {
    String DBconnection;
    String DBdisconnection;
    String DBquery;

    PostgreSQLConnection() {
        DBconnection = "Connected to PostgreSQL Database.";
        DBdisconnection = "Disconnected from PostgreSQL Database.";
        DBquery = "Executing query: SELECT * FROM orders;";
    }

    public String connect() {
        return DBconnection;
    }
    public String disconnect() {
        return DBdisconnection;
    }
    public String query() {
        return DBquery;
    }
}

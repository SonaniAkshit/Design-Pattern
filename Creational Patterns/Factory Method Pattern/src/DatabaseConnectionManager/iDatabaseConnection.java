package DatabaseConnectionManager;

interface iDatabaseConnection {
    String connect();
    String disconnect();
    String query();
}

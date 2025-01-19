package Database_Connection_Manager;
interface DatabaseConnection {

    String connect();
    String disconnect();
    String query();

}

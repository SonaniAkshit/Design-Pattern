package Database_Connection_Manager;

public class MongoDBConnection implements DatabaseConnection {

    String DBconnection;
    String DBdisconnection;
    String DBquery;
    MongoDBConnection(){
        DBconnection = "Connected to MongoDB Database.";
        DBdisconnection = "Disconnected from MongoDB Database.";
        DBquery="Executing query: db.collection.find({});";
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

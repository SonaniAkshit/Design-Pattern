package DatabaseConnectionManager;


public class MongoDBConnection implements iDatabaseConnection {

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


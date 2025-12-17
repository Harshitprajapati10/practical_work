package practice.lab05;
/*
. Implement a singleton class DatabaseConnection using a private constructor. Ensure that
the class restricts object creation to only one instance and provides a global access point using a
static method.
*/

class DatabaseConnection{
    private static DatabaseConnection instance;
    private DatabaseConnection(){
        System.out.println("db connection created");
    }
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    void connect(){
        System.out.println("connected to db");
    }
}

public class P4dbconnection{
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db1.connect();
        System.out.println(db1 == db2);
    }
}
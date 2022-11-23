package org.example.creational.singleton.implTwo;

//Singleton Class Eager Loading Implementation
public class Database {

    //Eager Loading of Database
    private static Database instance = new Database(null, null);

    private Database(String url, String hostname){
    }

    public static Database getInstance(){
        return instance;
    }
}

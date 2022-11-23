package org.example.creational.singleton.implThree;

//Singleton Class for Multi_Threaded Environment using Double Locking Mechanism
public class Database {
    private static Database instance = null;

    private Database(){
    }

    public static Database getInstance(){
        if(instance == null){
            synchronized (Database.class){
                if(instance == null){
                    instance = new Database();
                }
            }
        }

        return instance;
    }
}

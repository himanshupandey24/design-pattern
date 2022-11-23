package org.example.creational.singleton.implOne;

//Singleton Class
public class Database {
    private static Database instance = null;

    //If a class has a public constructor then it will not be a Singleton Class
    private Database(){
    }

    //If a constructor is private it is still visible to objects and methods of same class

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }

        return instance;
    }
}

// The above implementation will work for single threaded environment but
// not for multithreaded environment, if two classes are simultaneously calling the
// getInstance() when no instance of DB has been created then it will lead to
// 1. Concurrency Issues.
// 2. More than 1 object will be created.
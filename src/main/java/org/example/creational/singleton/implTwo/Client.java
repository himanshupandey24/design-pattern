package org.example.creational.singleton.implTwo;

public class Client {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
    }
}

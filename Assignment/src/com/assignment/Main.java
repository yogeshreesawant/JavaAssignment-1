package com.assignment;

public class Main {

    public static void main(String[] args) {
        employee e = new employee();
        e.name = "Yogeshree";
        e.age = 20;
        e.city = "Mumbai";

        employee e1 = new employee();
        e1.name = "Niharika";
        e1.age = 21;
        e1.city = "Delhi";

        e.function();
        e1.function();
    }
}

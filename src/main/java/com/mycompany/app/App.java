package com.mycompany.app;

/**
 * Hello wakaw!
 */
public class App
{

    private final String message = "Hello wakaw!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}

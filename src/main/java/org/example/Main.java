package org.example;

import org.example.controller.SomeController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SomeController someController = new SomeController();
        someController.handleRequest("deal", "etc", "create", "abc");
    }
}
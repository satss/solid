package org.example.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class DealResourceHandler implements IResource{

    private final Map<String, Consumer<String>> hashMap = new HashMap<>() {
        {
            put("create", str -> handleCreateEvent(str));
            put("update", str -> handleUpdateEvent(str));
            put("delete", str -> handleDeleteEvent(str));
        }
    };

    @Override
    public void handleDifferentTypeResources(String event, String subject, String data) {

        System.out.println(subject);
        System.out.println(data);
        System.out.println(event);
        System.out.println("inside deal");
        hashMap.get(subject).accept(data);
    }

    private void handleCreateEvent(String data) {
        System.out.println("im in create deal");
        System.out.println(data);

    }

    private void handleUpdateEvent(String data) {
        System.out.println("im in update deal");
        System.out.println(data);


    }

    private void handleDeleteEvent(String data) {
        System.out.println("im in delete deal");
        System.out.println(data);



    }
}




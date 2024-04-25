package org.example.controller;


import java.util.HashMap;
import java.util.Map;

public class SomeController {

    private final Map<String,IResource> hashMap = new HashMap<>(){
        {put("company-deal",new CompanyDealResourceHandle());
         put("deal", new DealResourceHandler());}
    };


    public void handleRequest(String resource, String eventType,
                              String subject,String data) {
        IResource iResource = hashMap.get(resource);
        iResource.handleDifferentTypeResources(eventType,subject,data);
    }
}

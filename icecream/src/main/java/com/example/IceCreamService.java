package com.example;

import com.example.model.IceCreamType;

import java.util.ArrayList;
import java.util.List;

public class IceCreamService {
    public List getAvailableFlavors(IceCreamType type){

        List flavors = new ArrayList();

        if(type.equals(IceCreamType.Chocolate)){
            flavors.add("Dark Chocolate");
            flavors.add("Milk Chocolate");
            flavors.add("Chocolate Cake");
        }
        else if(type.equals(IceCreamType.Strawberry)){
            flavors.add("Strawberry");
        }
        else{
            flavors.add("Not available");
        }
    return flavors;

    }
}

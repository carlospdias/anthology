package com.cpdias.autofac;

import java.util.ArrayList;
import java.util.List;

public class Origin {
    
    private String name;
    
    private List<Tale>tales = new ArrayList<>();

    public Origin(String name) {
        super();
        this.name = name;
    }
    
    public void addTale(final Tale tale) {
        if (tale != null) {
            tales.add(tale);
            
        }
    }

    public List<Tale> getTales() {
        return tales;
    }

    public String getName() {
        return name;
    }
    
}

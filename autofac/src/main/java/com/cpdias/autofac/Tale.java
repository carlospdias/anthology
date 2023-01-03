package com.cpdias.autofac;

public class Tale {
    private String link;
    private String description;
    private String name;
    
    public Tale(String name, String link, String description) {
        super();
        this.name = name;
        this.link = link;
        this.description = description;
    }

    
    public String getName() {
        return name;
    }


    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }
    
    
}

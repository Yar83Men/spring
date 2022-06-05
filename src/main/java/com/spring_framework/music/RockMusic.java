package com.spring_framework.music;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockBean")
@Scope("prototype")
public class RockMusic implements Music {
    protected static final String[] listOfComposition = {
            "Metallica", "Rammstein", "CannibalCorpse"
    };

    @Override
    public String getSong() {
        return "Master of Puppets";
    }

    public void init() {
        System.out.println("Init method Rock");
    }

    public void destroy() {
        System.out.println("Destroy method Rock");
    }

    @Override
    public String toString() {
        return "RockMusic";
    }
}

package com.spring_framework.music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("juzzBean")
@Scope("prototype")
public class JuzzMusic implements Music{

    protected static final String[] listOfComposition = {
            "Armstrong", "JuzzBand", "SuperJuzz"
    };

    @Override
    public String getSong() {
        return "Armstrong";
    }

    @Override
    public String toString() {
        return "JuzzMusic";
    }
}

package com.spring_framework.music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicBean")
@Scope("prototype")
public class ClassicalMusic implements Music {

    protected static final String[] listOfComposition = {
            "Mozart", "Strauss", "Vivaldi"
    };

    @Override
    public String getSong() {
        return "Mozart";
    }

    @Override
    public String toString() {
        return "ClassicalMusic";
    }
}

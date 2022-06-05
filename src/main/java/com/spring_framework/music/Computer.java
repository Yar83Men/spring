package com.spring_framework.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("computerBean")
@Scope("prototype")
public class Computer {
    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", player=" + player +
                '}';
    }
}

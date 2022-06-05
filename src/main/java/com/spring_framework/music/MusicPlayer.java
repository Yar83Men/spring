package com.spring_framework.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("playerBean")
@PropertySource("classpath:musicPlayer.properties")
@Scope("prototype")
public class MusicPlayer {
    private Music music;
    @Value("${player.name}")
    private String name;
    @Value("${player.volume}")
    private Integer volume;
    private List<Music> list = new ArrayList<>();

    @Autowired
    public MusicPlayer(@Qualifier("rockBean") Music music) {
        this.music = music;
    }

    public MusicPlayer() {

    }

    public List<Music> getList() {
        return list;
    }

    @Autowired
    public void setList(List<Music> list) {
        this.list = list;
    }

    public void playListMusic() {
        list.forEach(m -> System.out.println("Playing : " + m.getSong()));
    }

    public String playMusic() {
        //System.out.println("Playing : " + music.getSong());
        return "Playing : " + music.getSong();
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void playRandomMusic(MusicStyles styles) {
        if(styles == MusicStyles.Classical) {
            Random random = new Random();
            int size = ClassicalMusic.listOfComposition.length;
            String composition = ClassicalMusic.listOfComposition[random.nextInt(size)];
            System.out.println("Playing : " + composition);
        }
        if (styles == MusicStyles.Rock) {
            Random random = new Random();
            int size = RockMusic.listOfComposition.length;
            String composition = RockMusic.listOfComposition[random.nextInt(size)];
            System.out.println("Playing : " + composition);
        }

        if (styles == MusicStyles.Juzz) {
            Random random = new Random();
            int size = JuzzMusic.listOfComposition.length;
            String composition = JuzzMusic.listOfComposition[random.nextInt(size)];
            System.out.println("Playing : " + composition);
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", list=" + list +
                '}';
    }
}

package com.spring_framework.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;


public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext2.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //MusicPlayer player = context.getBean("playerBean", MusicPlayer.class);
        //player.playMusic();
//        System.out.println(player.getName() + "  "+ player.getVolume());
//        player.playListMusic();
//
//        FabricMethod fabricMethod = context.getBean("fabricBean", FabricMethod.class);
//        fabricMethod.getSong();
//        Music music = context.getBean("classicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);
//        MusicPlayer player = context.getBean("playerBean", MusicPlayer.class);
//        player.playListMusic();
        //player.playMusic();

//        Computer computer = context.getBean("computerBean", Computer.class);
//        System.out.println(computer);
        MusicPlayer player = context.getBean("playerBean", MusicPlayer.class);
        player.playRandomMusic(MusicStyles.Rock);
       // player.playListMusic();
        context.close();
    }
}

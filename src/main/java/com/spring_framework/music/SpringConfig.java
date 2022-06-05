package com.spring_framework.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
// @ComponentScan("com.spring_framework.music")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicBean(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockBean(){
        return new RockMusic();
    }

    @Bean
    public JuzzMusic juzzBean(){
        return new JuzzMusic();
    }

    @Bean
    public MusicPlayer playerBean(){
        return new MusicPlayer();
    }

    @Bean
    public Computer computerBean(){
        return new Computer(playerBean());
    }
}

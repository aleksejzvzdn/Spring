package com.zvezdin.study.config;

import com.zvezdin.study.*;
import com.zvezdin.study.genres.ClassicalMusic;
import com.zvezdin.study.genres.JazzMusic;
import com.zvezdin.study.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList() {return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());}
}

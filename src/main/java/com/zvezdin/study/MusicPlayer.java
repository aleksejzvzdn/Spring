package com.zvezdin.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> genres;


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String playMusic() {
        Random random = new Random();
        return name + " playing: " + genres.get(random.nextInt(genres.size())).getSong()
                + " with volume " + this.volume;
    }
}

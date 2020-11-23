package com.zvezdin.study.genres;

import com.zvezdin.study.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {
    private List<String> list = new ArrayList<>();

    {
        list.add("Trepak by P.I. Chakovsky from ballet Nutcracker");
        list.add("To Elise");
        list.add("Toccata and Fuge in d-moll");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}

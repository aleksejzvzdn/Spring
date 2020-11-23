package com.zvezdin.study.genres;

import com.zvezdin.study.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JazzMusic implements Music {
    private List<String> list = new ArrayList<>();

    {
        list.add("What a wonderful world");
        list.add("Moses");
        list.add("Helicopter");
    }
    @Override
    public String getSong() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

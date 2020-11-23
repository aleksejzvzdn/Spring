package com.zvezdin.study.genres;

import com.zvezdin.study.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    private List<String> list = new ArrayList<>();

    {
        list.add("Pink Floyd - Comfortably Numb");
        list.add("Led Zeppelin - Stairway to  Heaven");
        list.add("The White Stripes - Seven nation army");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

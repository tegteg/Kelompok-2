package com.example.nabilla_pc.fragmentfinalproject;

import java.util.ArrayList;
import java.util.List;

public class BodyImageAssets {

    //Variabel ini adalah variabel untuk mengumpulkan gambar heads jadi satu.
    private static List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
    }};

    //Variabel ini adalah variabel untuk mengumpulkan gambar heads jadi satu.
    private static List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.leg1);
        add(R.drawable.leg2);
        add(R.drawable.leg3);
    }};

    public static List<Integer> getBodies() {
        return bodies;
    }

    public static List<Integer> getLegs() {
        return legs;
    }
}
package com.example.nabilla_pc.fragmentfinalproject;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState==null){
            //inisiasi adapter untuk mengaktifkan fragment
            FragmentManager fm = getSupportFragmentManager();
            //Transaksi fragment
            BodyPartsFragments bodyPart;

            //Membuat object untuk badan
            bodyPart = new BodyPartsFragments();
            bodyPart.setImgId(BodyImageAssets.getBodies());
            bodyPart.setIndexImg(0);
            fm.beginTransaction().add(R.id.bodies_container,bodyPart).commit();

            //Membuat object untuk kaki
            bodyPart = new BodyPartsFragments();
            bodyPart.setImgId(BodyImageAssets.getLegs());
            bodyPart.setIndexImg(0);
            fm.beginTransaction().add(R.id.legs_container,bodyPart).commit();
        }
    }
}

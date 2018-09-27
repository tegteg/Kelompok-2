package com.example.nabilla_pc.fragmentfinalproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartsFragments extends Fragment {

    private List<Integer> imgId;
    private Integer indexImg;
    private static String TAG="BodyPartsFragment";
    public static final String IMAGE_ID_LIST="image_ids";
    public static final String LIST_INDEX="list_index";

    public BodyPartsFragments() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Menyimpan session
        if(savedInstanceState!=null){
            imgId=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            indexImg=savedInstanceState.getInt(LIST_INDEX);
        }

        //Membuat tampilan fragment dari fragment layout
        View rootView = inflater.inflate(R.layout.fragment_layout,container,false);

        //Menyatakan bahwa gambar akan diletakan pada id imageViewFragments
        final ImageView imageViewVar = rootView.findViewById(R.id.imageViewFragments);

        //Mengisi id:imageView dengan gambar dari resource
//        imageViewVar.setImageResource(varAssets.getHeads().get(0));
        imageViewVar.setImageResource(imgId.get(indexImg));

        //Perintah ketika gambar ditekan
        imageViewVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (indexImg<imgId.size()-1){
                    indexImg++;
                }
                else{
                    indexImg=0;
                }
                imageViewVar.setImageResource(imgId.get(indexImg));
            }
        });

        return rootView;
    }

    public void setImgId(List<Integer> imgId) {
        this.imgId = imgId;
    }

    public void setIndexImg(Integer indexImg) {
        this.indexImg = indexImg;
    }

    @Override
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST,(ArrayList<Integer>)imgId);
        currentState.putInt(LIST_INDEX,indexImg);
    }
}

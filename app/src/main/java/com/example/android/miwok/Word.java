package com.example.android.miwok;

import android.media.Image;

/**
 * Created by whatt on 10/30/2017.
 */

public class Word {

    private String defaultTranslation;
    private String otherTranslation;
    private int imageResourceId;


    public Word(String def, String other){
        defaultTranslation = def;
        otherTranslation = other;
    }

    public Word(String def, String other, int img){
        defaultTranslation = def;
        otherTranslation = other;
        imageResourceId = img;

    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getOtherTranslation() {
        return otherTranslation;
    }

    public int getWordPic(){return imageResourceId;}

    public boolean hasPicture(){return imageResourceId!=0;}
}

package com.example.android.miwok;

/**
 * Created by whatt on 10/30/2017.
 */

public class Word {

    private String defaultTranslation;
    private String otherTranslation;


    public Word(String def, String other){
        defaultTranslation = def;
        otherTranslation = other;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getOtherTranslation() {
        return otherTranslation;
    }
}

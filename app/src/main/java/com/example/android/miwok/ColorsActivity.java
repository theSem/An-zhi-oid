package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an arrayList containing words for lesson
        ArrayList<Word> words = new ArrayList<Word>();
        words.addAll(Arrays.asList(
                new Word("green","绿色",R.drawable.color_green),
                new Word("yellow","黄色",R.drawable.color_mustard_yellow),
                new Word("blue","蓝色",R.drawable.color_blue),
                new Word("red","红色",R.drawable.color_red),
                new Word("gold","金色",R.drawable.color_gold),
                new Word("black","黑色",R.drawable.color_black),
                new Word("white","白色",R.drawable.color_white),
                new Word("brown","棕色",R.drawable.color_brown),
                new Word("orange","橙色",R.drawable.color_orange),
                new Word("color","颜色",R.drawable.color_rainbow)
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

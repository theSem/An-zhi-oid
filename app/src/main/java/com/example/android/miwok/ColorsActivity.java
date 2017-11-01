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
                new Word("green","绿色"),
                new Word("yellow","黄色"),
                new Word("blue","蓝色"),
                new Word("red","红色"),
                new Word("gold","金色"),
                new Word("black","黑色"),
                new Word("white","白色"),
                new Word("brown","棕色"),
                new Word("orange","橙色"),
                new Word("color","颜色")
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

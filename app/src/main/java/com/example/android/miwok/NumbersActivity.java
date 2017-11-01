package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an arrayList containing words for lesson
        ArrayList<Word> words = new ArrayList<Word>();
        words.addAll(Arrays.asList(
                new Word("one","一"),
                new Word("two","二"),
                new Word("three","三"),
                new Word("four","四"),
                new Word("five","五"),
                new Word("six","六"),
                new Word("seven","七"),
                new Word("eight","八"),
                new Word("nine","九"),
                new Word("ten","十")
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }


}

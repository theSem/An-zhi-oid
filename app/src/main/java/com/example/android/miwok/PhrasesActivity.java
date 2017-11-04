package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an arrayList containing words for lesson
        ArrayList<Word> words = new ArrayList<Word>();
        words.addAll(Arrays.asList(
                new Word("Hello","你好"),
                new Word("How are you?","你好吗"),
                new Word("What's your name?","你叫什么名字？"),
                new Word("My name is ...","我叫。。。"),
                new Word("How about you?","你呢？"),
                new Word("I have diarrhea","我拉肚子"),
                new Word("Good bye！","再见"),
                new Word("What time is it?","现在几点了？"),
                new Word("Hey (informal)","喂"),
                new Word("Why?","为什么？")
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

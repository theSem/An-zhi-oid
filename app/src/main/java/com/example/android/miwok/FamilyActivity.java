package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an arrayList containing words for lesson
        ArrayList<Word> words = new ArrayList<Word>();
        words.addAll(Arrays.asList(
                new Word("Mom","妈妈"),
                new Word("Dad","爸爸"),
                new Word("Younger Brother","弟弟"),
                new Word("Older Brother","哥哥"),
                new Word("Younger Sister","妹妹"),
                new Word("Older Sister","姐姐"),
                new Word("Grandfather (Father's)","爷爷"),
                new Word("Grandmother (Father's)","奶奶"),
                new Word("Grandfather (Mother's)","外祖父"),
                new Word("Grandmother (Mother's)","外婆")
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

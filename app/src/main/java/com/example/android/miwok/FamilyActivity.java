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
                new Word("Mom","妈妈",R.drawable.family_mother),
                new Word("Dad","爸爸",R.drawable.family_father),
                new Word("Younger Brother","弟弟",R.drawable.family_younger_brother),
                new Word("Older Brother","哥哥",R.drawable.family_older_brother),
                new Word("Younger Sister","妹妹",R.drawable.family_younger_sister),
                new Word("Older Sister","姐姐",R.drawable.family_older_sister),
                new Word("Grandfather (Father's)","爷爷",R.drawable.family_grandfather),
                new Word("Grandmother (Father's)","奶奶",R.drawable.family_grandmother),
                new Word("Grandfather (Mother's)","外祖父",R.drawable.family_grandfather),
                new Word("Grandmother (Mother's)","外婆",R.drawable.family_grandmother)
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

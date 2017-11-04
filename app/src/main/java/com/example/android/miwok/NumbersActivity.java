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
                new Word("one","一",R.drawable.number_one),
                new Word("two","二",R.drawable.number_two),
                new Word("three","三",R.drawable.number_three),
                new Word("four","四",R.drawable.number_four),
                new Word("five","五",R.drawable.number_five),
                new Word("six","六",R.drawable.number_six),
                new Word("seven","七",R.drawable.number_seven),
                new Word("eight","八",R.drawable.number_eight),
                new Word("nine","九",R.drawable.number_nine),
                new Word("ten","十",R.drawable.number_ten)
        ));

        //Add the strings from words to layout
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }


}

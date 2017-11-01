package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by whatt on 10/30/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Custom constructor
     * @param context       The current context
     * @param words         List of Word objects to display in list
     */

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }

    /**
     * Provides view for AdapterView
     *
     * @param position          The position of data in the list to be displayed
     * @param convertView       Recycled view to populate
     * @param parent            Parent viewGroup
     * @return                  The view for the position
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView translation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        translation.setText(currentWord.getOtherTranslation());

        return listItemView;
    }
}

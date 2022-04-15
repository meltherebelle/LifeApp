package com.example.lifeapp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class MainAdapter extends BaseExpandableListAdapter {
    //Initialisation variables
    ArrayList<String> listGroup;
    HashMap<String,ArrayList<String>> listChild;

    //constructeur :
    public MainAdapter(ArrayList<String> listGroup, HashMap<String,ArrayList<String>> listChild) {
        this.listGroup = listGroup;
        this.listChild = listChild;

    }

    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        //return child list size
        return listChild.get(listGroup.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        //return group item
        return listGroup.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listChild.get(listGroup.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        //initialize view
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(android.R.layout.simple_expandable_list_item_1
                        ,viewGroup,false);
        //initialisation and assignation des variables
        TextView textView = view.findViewById(android.R.id.text1);
        //initialisation string
        String sGroup = String.valueOf(getGroupId(i));
        //Set text on textview
        textView.setText(sGroup);
        //set text style bold
        textView.setTypeface(null, Typeface.BOLD);
        //set text color
        textView.setTextColor(Color.BLUE);
        //return view
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        //initialisaiton view
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(android.R.layout.simple_selectable_list_item
                    ,viewGroup,false);

        //initialisation and assignation valeurs
        TextView textView = view.findViewById(android.R.id.text1);
        //initialisation string
        String sChild = String.valueOf(getChild(i,i1));
        //Set text on textview
        textView.setText(sChild);

        //set on click listener
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(viewGroup.getContext()
                    ,sChild,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}

package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

//the real HOBBY Activity !!!

public class Hobby extends AppCompatActivity {

    Button return22Btn;
    ExpandableListView expandableListHobby;

    //pour ma Expandable liste de hobbies
    ArrayList<String> listGroup = new ArrayList<>();
    HashMap<String,ArrayList<String>> listChild = new HashMap<>();
    MainAdapter adpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);

        //expandableListHobby
        expandableListHobby = findViewById(R.id.expandableListHobby);

        for (int g=0; g<=10; g++) {
            //ajout du groupe dans la liste
            listGroup.add("Group"+g);
            //création de la liste
            ArrayList<String> arrayList = new ArrayList<>();
            for (int c=0; c<=5; c++) {
                //ajout des valeurs dans la liste
                arrayList.add("Item"+c);
            }
            //ajout des valeurs dans la liste globale
            listChild.put(listGroup.get(g),arrayList);

        }

        //initialisation adapter
        adpater = new MainAdapter(listGroup,listChild);
        //set adapter
        expandableListHobby.setAdapter(adpater);

        //retourner sur l'acceuil au clic du bouton Return1Btn
        return22Btn = (Button) findViewById(R.id.return22Btn);
        return22Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
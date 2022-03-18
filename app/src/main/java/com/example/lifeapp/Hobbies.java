package com.example.lifeapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

//try commit -- error : failed to compile values file
public class Hobbies extends AppCompatActivity {
    Button Return11Btn;
    RecyclerView ListHobbies;
    FloatingActionButton add_button;
    public static Activity activity ;

    MyDatabaseHelper myDB;
    ArrayList<String> book_id, book_title, book_author, book_pages;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        activity=this;
        ListHobbies = findViewById(R.id.ListHobbies);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hobbies.this, AddActivity.class);
                startActivity(intent);
            }
        });

        //initialisation
        myDB = new MyDatabaseHelper(Hobbies.this);
        book_id = new ArrayList<>();
        book_title = new ArrayList<>();
        book_author = new ArrayList<>();
        book_pages = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(Hobbies.this,this, book_id, book_title, book_author,
                book_pages);
        ListHobbies.setAdapter(customAdapter);
        ListHobbies.setLayoutManager(new LinearLayoutManager(Hobbies.this));

        //retourner sur Perso
        Return11Btn = (Button) findViewById(R.id.Return11Btn);
        Return11Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerso();
            }
        });

    }

    public void openPerso() {
        Intent intent = new Intent(this, Perso.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){ //refreshing our hobbies activity
            recreate();
        }
    }

    //stock le résultat de readAllData dans les listes
    void storeDataInArrays() {
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {
                book_id.add(cursor.getString(0));
                book_title.add(cursor.getString(1));
                book_author.add(cursor.getString(2));
                book_pages.add(cursor.getString(3));
            }
        }
    }
}
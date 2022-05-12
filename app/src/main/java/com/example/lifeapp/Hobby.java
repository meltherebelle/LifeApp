package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

//the real HOBBY Activity !!!

public class Hobby extends AppCompatActivity {

    CheckBox ch, ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9;
    Button addBtn;
    TextView txtAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding MainActivity.java with activity_main.xml file
        setContentView(R.layout.activity_hobby);

        // Finding CheckBox by its unique ID
        ch=(CheckBox)findViewById(R.id.checkBox);
        ch1=(CheckBox)findViewById(R.id.checkBox2);
        ch2=(CheckBox)findViewById(R.id.checkBox3);
        ch3=(CheckBox)findViewById(R.id.checkBox4);
        ch4=(CheckBox)findViewById(R.id.checkBox5);
        ch5=(CheckBox)findViewById(R.id.checkBox7);
        ch6=(CheckBox)findViewById(R.id.checkBox8);
        ch9=(CheckBox)findViewById(R.id.checkBox9);


        txtAdd = (TextView)findViewById(R.id.txtAdd);
        addBtn = (Button)findViewById(R.id.add_button);

        /*addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch9.setText(txtAdd.getText());
            }
        });*/
    }

    // This function is invoked when the button is pressed.
    public void Check(View v)
    {
        String msg="";

        // Concatenation of the checked options in if

        // isChecked() is used to check whether
        // the CheckBox is in true state or not.

        if(ch.isChecked())
            msg = msg + " Painting ";
        if(ch1.isChecked())
            msg = msg + " Reading ";
        if(ch2.isChecked())
            msg = msg + " Singing ";
        if(ch3.isChecked())
            msg = msg + " Cooking ";

        // Toast is created to display the
        // message using show() method.
        Toast.makeText(this, msg + "are selected",
                Toast.LENGTH_LONG).show();
    }
}
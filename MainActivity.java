package com.example.pgard.myapplication;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileInputStream;

public class MainActivity extends AppCompatActivity {

    private EditText yourEditText;
    private List<String> list = new ArrayList<String>();
    private int idx = 0;







    public void buttonOnClick(View v)
    {
        Button button = (Button)v;
       // button.setText("I've Been Clicked!");
    }



    public boolean isValid(CharSequence s)
    {
        String str = s.toString();
        str = str.toLowerCase();
        boolean out;

        if (list.contains(str)) {
            out = true;

            list.remove(str);
            yourEditText = (EditText) findViewById(R.id.editText2);
            yourEditText.setText("");
        }
        else
        {
            out = false;
        }
        return out;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {




        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("plum");
        list.add("grape");
        list.add("pineapple");
        list.add("lemon");
        list.add("lime");
        list.add("coconut");
        list.add("cherry");
        list.add("blueberry");
        list.add("raspberry");
        list.add("cranberry");
        list.add("melon");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        yourEditText = (EditText) findViewById(R.id.editText2);

        yourEditText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                // you can call or do what you want with your EditText here


            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
               View v = findViewById(R.id.textView3);
                TextView text = (TextView) v;



                if(isValid(s)) {
                    idx++;
                    String str = String.valueOf(idx) + ": " + s.toString() + "\n" + text.getText();
                    text.setText(str);

                }
                else
                {

                }

            }
        });
    }

}



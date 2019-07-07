package com.example.handle_events_with_layoutfilesxml_javaobjects_butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Button buttonJava;

    @BindView(R.id.button_butter_knife_1)
    Button button_One;

    //using butter knife OnClick.
    @OnClick(R.id.button_butter_knife_2)
    public void butterKnife_Button2Clicked(){
        Toast.makeText(getApplicationContext(), "Button_2 event handle using Butter Knife is clicked.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        //using java
        buttonJava = findViewById(R.id.button_java);
        buttonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button event handle using Java is clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        //using butter knife BindView.
        button_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button_1 event handle using Butter Knife is clicked.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void button_xml(View view){
        Toast.makeText(getApplicationContext(), "Button Declared in Layout File(XML) is clicked.", Toast.LENGTH_SHORT).show();
    }
}

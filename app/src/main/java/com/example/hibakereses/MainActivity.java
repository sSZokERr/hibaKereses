package com.example.hibakereses;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textViewResult;
    private Button buttonSubmit, buttonRandom;
    private EditText editTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int red = random.nextInt(255);
                int green = random.nextInt(255);
                int blue = random.nextInt(255);

                textViewResult.setBackgroundColor(Color.rgb(red, green, blue));
                textViewResult.setText("(R: " + red + ", G: " + green + ", B: " + blue + ")");
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String seged = editTextInput.getText().toString();
                textViewResult.setText(seged);
            }
        });
    }

    public void init() {
        relativeLayout = findViewById(R.id.relativeLayout);
        textViewResult = findViewById(R.id.textViewResult);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonRandom = findViewById(R.id.buttonRandom);
        editTextInput = findViewById(R.id.editTextInput);
    }
}
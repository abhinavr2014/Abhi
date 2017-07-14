package com.reddyproject.abhinav.higherandlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void guess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());
        if(guessInt > randomnumber){
            Toast.makeText(MainActivity.this, "u guessed it HIGHER", Toast.LENGTH_SHORT).show();
        }else if(guessInt < randomnumber){
            Toast.makeText(MainActivity.this, "u guessed it LOWAR", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "CONGRAGULATIONS U GUESSED IT RIGHT", Toast.LENGTH_SHORT).show();
            Random rand = new Random();

            randomnumber = rand.nextInt(20)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomnumber = rand.nextInt(20)+1;
    }
}

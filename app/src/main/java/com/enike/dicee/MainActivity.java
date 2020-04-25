package com.enike.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.roll_button);
        final ImageView left_bnt = findViewById(R.id.left_dice);
        final ImageView right_btn = findViewById(R.id.right_dice);

        final int [] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("button Pressed!","button was touched");
                Random randomGenerator = new Random ();
                int number = randomGenerator.nextInt(6);
                int number2 = randomGenerator.nextInt(6);
                Log.d("out random number","is"+ number);
                left_bnt.setImageResource(diceArray[number]);
                right_btn.setImageResource(diceArray[number2]);

            }
        });

    }
}

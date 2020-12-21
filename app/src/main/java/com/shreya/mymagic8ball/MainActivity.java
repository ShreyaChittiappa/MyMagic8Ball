package com.shreya.mymagic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

//Main
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);

        TextView textView;
        textView = (TextView) findViewById(R.id.textView);

        ImageView ballDisplay;
        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] diceArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice", "Button is pressed");
                Random randomNumber = new Random();
                int number =randomNumber.nextInt(5);
                ballDisplay.setImageResource(diceArray[number]);
            }
        });


    }
}
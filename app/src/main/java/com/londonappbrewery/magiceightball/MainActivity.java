package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the image view with id image_eightBall to variable ballDisplay
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        // An array that references the 5 images in the drawable folder
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // Link the button with the id askButton to a Button variable called myButton
        Button myButton = (Button) findViewById(R.id.askButton);

        // Create a listener for when the button is tapped
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a random number generator
                Random randomNumberGenerator = new Random();
                
                // Generate a random number between 0 and 4
                int number = randomNumberGenerator.nextInt(5);

                // Set the ballDisplay variable to a random array number
                ballDisplay.setImageResource(ballArray[number]);
            }
        });

    }
}

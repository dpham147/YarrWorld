package edu.orangecoastcollege.cs273.dpham147.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button speakButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Restoring user settings from previous session
        super.onCreate(savedInstanceState);
        // Inflating layout activity_main.xml
        setContentView(R.layout.activity_main);
    }

    speakButton = (Button) findViewById(R.id.speakButton);
}

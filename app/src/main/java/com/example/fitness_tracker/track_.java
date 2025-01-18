package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class track_ extends AppCompatActivity{
    private TextView activityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        activityTextView = findViewById(R.id.activity_text_view);
        activityTextView.setText("Track Activity Page"); // Example text, replace with your content
    }
}

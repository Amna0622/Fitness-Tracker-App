package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class track_calories extends AppCompatActivity {
    private TextView caloriesTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_calories);
        caloriesTextView = findViewById(R.id.calories_text_view);
        caloriesTextView.setText("Track Calories Page"); // Example text, replace with your content
    }
}

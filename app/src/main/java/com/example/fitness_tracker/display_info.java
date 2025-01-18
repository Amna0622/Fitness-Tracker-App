package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Display_Info extends AppCompatActivity {

    private CardView tracker1;
    private CardView track_calories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        tracker1 = findViewById(R.id.tracker1);
        track_calories = findViewById(R.id.track_calories);

        tracker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrackActivity = new Intent(Display_Info.this, track_.class);
                startActivity(intentTrackActivity);
            }
        });

        track_calories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrackCalories = new Intent(Display_Info.this, track_calories.class);
                startActivity(intentTrackCalories);
            }
        });
    }
}

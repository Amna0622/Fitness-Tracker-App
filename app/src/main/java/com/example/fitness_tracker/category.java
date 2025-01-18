package com.example.fitness_tracker;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Get the selected category and description from the Intent
        String selectedCategory = getIntent().getStringExtra("selectedCategory");
        String categoryDescription = getIntent().getStringExtra("categoryDescription");

        // Display the selected category and description in TextViews
        TextView categoryTextView = findViewById(R.id.categoryTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);

        categoryTextView.setText(selectedCategory);
        descriptionTextView.setText(categoryDescription);
    }
}

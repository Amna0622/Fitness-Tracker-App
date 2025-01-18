package com.example.fitness_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class fitnesstracker extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner categorySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitnesstracker);

        categorySpinner = findViewById(R.id.spinner_fitness_categories);

        List<String> categories = new ArrayList<>();
        categories.add("Cardio");
        categories.add("Strength training");
        categories.add("Flexibility");
        categories.add("Balance");
        categories.add("Heart Monitoring");
        categories.add("Sleep duration");
        categories.add("Stress level");
        categories.add("Water intake");
        categories.add("Calories burned");
        categories.add("Exercise type");
        categories.add("Blood oxygen level");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapter);
        categorySpinner.setOnItemSelectedListener(this);

        MaterialButton btnViewCategory = findViewById(R.id.btn_view_category);
        MaterialButton btnSetGoal = findViewById(R.id.btn_set_goal);


        btnViewCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for navigating to CategoryDetailsActivity
                String selectedCategory = categorySpinner.getSelectedItem().toString();
                Intent intent = new Intent(fitnesstracker.this, category.class);
                intent.putExtra("selectedCategory", selectedCategory);
                startActivity(intent);
            }
        });

        btnSetGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform goal setting action, e.g., save the goal to a database
                String goal = ((TextInputEditText) findViewById(R.id.edit_text_goal)).getText().toString();
                // Perform your goal-setting logic here
                showToast("Goal set: " + goal);

                // Navigate to the choose fitness goal page
                Intent intent = new Intent(fitnesstracker.this, choose_Fitness_Goal.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Handle spinner item selection if needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle the case where no item is selected, if necessary
    }

    private void showToast(String message) {
        // Method to show a toast message
    }
}

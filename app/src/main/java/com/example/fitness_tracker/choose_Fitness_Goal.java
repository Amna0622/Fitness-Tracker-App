package com.example.fitness_tracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class choose_Fitness_Goal extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_fitness_goal); // Make sure to use your layout file name

        // Find views by their IDs
        radioGroup = findViewById(R.id.radioGroup);
        viewButton = findViewById(R.id.button);

        // Set click listener for the button
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected radio button's ID
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // Find the selected radio button by ID
                RadioButton selectedRadioButton = findViewById(selectedId);

                if (selectedRadioButton != null) {
                    // Get the text of the selected radio button
                    String selectedGoal = selectedRadioButton.getText().toString();

                    // Show a toast with the selected goal
                    Toast.makeText(choose_Fitness_Goal.this, "Selected Goal: " + selectedGoal, Toast.LENGTH_SHORT).show();
                } else {
                    // If no radio button is selected, show a message
                    Toast.makeText(choose_Fitness_Goal.this, "Please select a goal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
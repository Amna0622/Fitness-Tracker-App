package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
        private EditText edtNumber1, edtNumber2;
        private TextView txtResult;
        private Button btnSum, btnMultiply, btnSubtraction, btnDivision;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculator); // Assuming your layout is named activity_calculator.xml


            // Hide the action bar
            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }



            // Initialize UI elements
            edtNumber1 = findViewById(R.id.edt_number1);
            edtNumber2 = findViewById(R.id.edt_number2);
            txtResult = findViewById(R.id.txt_result);
            btnSum = findViewById(R.id.btn_sum);
            btnMultiply = findViewById(R.id.btn_multiply);
            btnSubtraction = findViewById(R.id.btn_subtraction);
            btnDivision = findViewById(R.id.btn_division);

            // Set click listeners for buttons
            btnSum.setOnClickListener(view -> performCalculation("+"));
            btnMultiply.setOnClickListener(view -> performCalculation("*"));
            btnSubtraction.setOnClickListener(view -> performCalculation("-"));
            btnDivision.setOnClickListener(view -> performCalculation("/"));
        }

        private void performCalculation(String operation) {
            try {
                // Get input values (convert to double for more accurate calculations)
                double no1 = Double.parseDouble(edtNumber1.getText().toString());
                double no2 = Double.parseDouble(edtNumber2.getText().toString());

                // Perform calculation based on operation
                double result;
                switch (operation) {
                    case "+":
                        result = no1 + no2;
                        break;
                    case "-":
                        result = no1 - no2;
                        break;
                    case "*":
                        result = no1 * no2;
                        break;
                    case "/":
                        // Handle division by zero
                        if (no2 == 0) {
                            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        result = no1 / no2;
                        break;
                    default:
                        return;
                }

                // Display the result
                txtResult.setText(String.valueOf(result));

            } catch (NumberFormatException e) {
                // Handle invalid input (e.g., user enters non-numeric values)
                Toast.makeText(this, "Invalid input. Please enter numbers only.", Toast.LENGTH_SHORT).show();
            }
        }
    }
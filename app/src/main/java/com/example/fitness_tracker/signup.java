package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    private EditText usernameInput;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText confirmPasswordInput;
    private Button registerBtn;
    // ... (other UI elements if needed)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup); // Use the correct layout file name

        // Hide the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        usernameInput = findViewById(R.id.editTextTextPersonName);
        emailInput = findViewById(R.id.editTextTextPersonName5);
        passwordInput = findViewById(R.id.editTextTextPersonName6);
        confirmPasswordInput = findViewById(R.id.editTextTextPersonName7);
        registerBtn = findViewById(R.id.button);
        // ... (initialize other UI elements if needed)

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();
                String confirmPassword = confirmPasswordInput.getText().toString();

                // Validate user input
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(email) ||
                        TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {
                    Toast.makeText(signup.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(signup.this, "Passwords don't match", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Perform signup logic (replace with your actual registration code)
                // For example, you can use Firebase Authentication or a custom backend
                // Here's a simple example:
                // ... (your signup logic)

                Toast.makeText(signup.this, "Registration successful!", Toast.LENGTH_SHORT).show();

                // Navigate to the login activity after signup
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }
}
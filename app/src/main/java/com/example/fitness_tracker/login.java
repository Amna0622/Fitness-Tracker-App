package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private Button loginBtn;
    private Button signupBtn;



    // ... (other UI elements if needed)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Hide the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        loginBtn = findViewById(R.id.login_btn);
        signupBtn = findViewById(R.id.signup_btn);

        // ... (initialize other UI elements if needed)

        // Login button click listener
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Validate user input (you might want to add more validation logic)
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(login.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Perform login logic (replace with your actual authentication code)
                // For example, you can use Firebase Authentication or a custom backend
                // Here's a simple example:
                if (username.equals("user") && password.equals("password")) {
                    Toast.makeText(login.this, "Login successful!", Toast.LENGTH_SHORT).show();
                    // Start the next activity (e.g., the home activity)
                    Intent intent = new Intent(login.this, home_.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Signup button click listener
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the signup activity
                Intent intent = new Intent(login.this,signup.class);
                startActivity(intent);
            }
        });



    }
}
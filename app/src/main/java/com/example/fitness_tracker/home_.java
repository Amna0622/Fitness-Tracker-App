package com.example.fitness_tracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class home_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize CardViews
        CardView cardProfile = findViewById(R.id.cardProfile);
        CardView cardWorkout = findViewById(R.id.cardWorkout);
        CardView cardNutrition = findViewById(R.id.cardNutrition);
        CardView cardProgress = findViewById(R.id.cardProgress);
        CardView cardSettings = findViewById(R.id.cardSettings);
        CardView cardLogout = findViewById(R.id.cardLogout);

        // Set OnClickListener for each CardView
        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_.this, profile.class);
                startActivity(intent);
            }
        });

        cardWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_.this, workout.class);
                startActivity(intent);
            }
        });

        cardNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_.this, nutrition.class);
                startActivity(intent);
            }
        });

        cardProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_.this, progress.class);
                startActivity(intent);
            }
        });

        cardSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home_.this, setting.class);
                startActivity(intent);
            }
        });

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLogoutDialog();
            }
        });
    }

    // Method to display an AlertDialog
    private void showAlert(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                showToast(message);
            }
        });
        builder.show();
    }

    // Method to display a Toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // Method to display the logout confirmation dialog
    private void showLogoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                logout();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    // Method to handle the logout process
    private void logout() {
        // Implement the logout logic here
        // For example, you can clear user data, stop services, etc.

        // Redirect to the login screen or finish the activity
        Intent intent = new Intent(home_.this, login.class);
        startActivity(intent);
        finish();

        // Show a logout success message
        showToast("You have been logged out successfully.");
    }
}
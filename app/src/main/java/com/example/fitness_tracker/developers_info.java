package com.example.fitness_tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class developers_info extends AppCompatActivity {

    private ImageView profileImage, facebookIcon, linkedinIcon, instagramIcon;
    private TextView developerName, developerRole, developerBio, connectWithMe;

private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers_info);

        // Initialize views
        profileImage = findViewById(R.id.profile_image);
        developerName = findViewById(R.id.developer_name);
        developerRole = findViewById(R.id.developer_role);
        developerBio = findViewById(R.id.developer_bio);
        connectWithMe = findViewById(R.id.connect_with_me);
        facebookIcon = findViewById(R.id.facebook_icon);
        linkedinIcon = findViewById(R.id.linkedin_icon);
        instagramIcon = findViewById(R.id.instagram_icon);
    profileImage = findViewById(R.id.profile_image);
    developerName = findViewById(R.id.developer_name);
    developerRole = findViewById(R.id.developer_role);
    developerBio = findViewById(R.id.developer_bio);
    connectWithMe = findViewById(R.id.connect_with_me);
    facebookIcon = findViewById(R.id.facebook_icon);
    linkedinIcon = findViewById(R.id.linkedin_icon);
    instagramIcon = findViewById(R.id.instagram_icon);
        // Set developer details
        profileImage.setImageResource(R.drawable.profile);
        developerName.setText("Amina Naeem");
        developerRole.setText("Fitness App Developer");
        developerBio.setText("Creating innovative fitness solutions.");
        connectWithMe.setText("Connect With Me");

        // Set click listeners for social icons
        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.facebook.com/profile.php?id=61556092004889&mibextid=ZbWKwL");
            }
        });

        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("www.linkedin.com/in/amina-naeem-3bb291246");
            }
        });

        instagramIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.instagram.com/iamna.naeem_?igsh=c2NsbzZ1OGhyb3Ni");
            }
        });
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
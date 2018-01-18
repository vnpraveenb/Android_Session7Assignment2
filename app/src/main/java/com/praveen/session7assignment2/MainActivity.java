package com.praveen.session7assignment2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent contacts = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));

                // Show Contact Page Activity with Initialized intent
                startActivity(contacts);
            }
        });
    }
}

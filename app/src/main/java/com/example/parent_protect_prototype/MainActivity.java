package com.example.parent_protect_prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button signup,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup=findViewById(R.id.button2);
        login=findViewById(R.id.button3);

        signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Clicked signup", Toast.LENGTH_LONG).show();
                    Intent i =new Intent(MainActivity.this, signupActivity.class);
                    startActivity(i);
                }
            });
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login_activity.class));

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
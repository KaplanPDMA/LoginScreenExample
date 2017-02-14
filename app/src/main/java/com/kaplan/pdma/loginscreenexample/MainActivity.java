package com.kaplan.pdma.loginscreenexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();
                if(username.equalsIgnoreCase("alice") && password.equalsIgnoreCase("1234")) {
                    startActivity(new Intent(MainActivity.this, Activity2.class));
                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

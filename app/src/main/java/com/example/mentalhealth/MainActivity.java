package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername,txtPassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testing1);

        BindUiElements();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                String specialCharRegex = ".*[@#!$%^&+=].*";
                String upperCaseRegex = ".*[A-Z].*";
                String numberRegex = ".*[0-9].*";
                String lowerCaseRegex = ".*[a-z].*";

                if(username.length() <= 0 && password.length() <= 0) {
                    Toast.makeText(MainActivity.this, "Username or Password cannot be empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(!password.matches(specialCharRegex)){
                        Toast.makeText(MainActivity.this, "Password should contain special character", Toast.LENGTH_SHORT).show();
                    }
                    else if(!password.matches(upperCaseRegex)) {
                        Toast.makeText(MainActivity.this, "Password should contain Uppercase letter", Toast.LENGTH_SHORT).show();
                    }
                    else if(!password.matches(lowerCaseRegex)) {
                        Toast.makeText(MainActivity.this, "Password should contain Lowercase letter", Toast.LENGTH_SHORT).show();
                    }
                    else if(!password.matches(numberRegex)) {
                        Toast.makeText(MainActivity.this, "Password should contain Number", Toast.LENGTH_SHORT).show();
                    }
                    else if(password.length() < 8) {
                        Toast.makeText(MainActivity.this, "Password should contain atleast 8 characters", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Bundle bundle = new Bundle();
                        bundle.putString("Username",username);
                        bundle.putString("Password",password);

                        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private void BindUiElements() {
        txtUsername = (EditText) findViewById(R.id.signup_txt_username);
        txtPassword = (EditText) findViewById(R.id.signup_txt_password);
        btnSignUp = (Button) findViewById(R.id.signup_btn_signup);
    }
}
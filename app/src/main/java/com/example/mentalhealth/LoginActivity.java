package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    Button btnLogin;
    Integer clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testing2);

        //To retrieve the Username and Password from Signup Activity
        Bundle bundle = getIntent().getExtras();
        String signupUsername = bundle.getString("Username");
        String signupPassword = bundle.getString("Password");

        BindUiElement();

        //Create a EVENT for button to get the CLICK ACTION
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get Username and Password from Login Screen
                String uname = txtUsername.getText().toString();
                String pass = txtPassword.getText().toString();

                //Check if the User has already tried 2 Attempt to Login
                if(clickCount < 2) {

                    //Check Username and Password entered by user with Signup Activity Username and Password
                    if (uname.equals(signupUsername) && pass.equals(signupPassword)) {
                        Toast.makeText(LoginActivity.this, "Successful Login", Toast.LENGTH_LONG).show();
                        // Create an intent to start MainActivity2
                        Intent intent = new Intent(LoginActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                    else {
                        //Increase click count if Login failed
                        clickCount++;
                        Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    //Login Attempt failed
                    Toast.makeText(LoginActivity.this, "Failed Login Attempt", Toast.LENGTH_SHORT).show();

                    //Disable Login Button , not allowing user to retry after 2 attempt
                    btnLogin.setEnabled(false);
                }
            }
        });
    }

    private void BindUiElement() {
        txtUsername = (EditText) findViewById(R.id.login_txt_username);
        txtPassword = (EditText) findViewById(R.id.login_txt_password);
        btnLogin = (Button) findViewById(R.id.login_btn_signup);
    }

}
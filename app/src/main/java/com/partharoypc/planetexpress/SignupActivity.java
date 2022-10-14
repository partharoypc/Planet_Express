package com.partharoypc.planetexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignupActivity extends AppCompatActivity {
    EditText signupEmail,signupNumber,signupPassword;
    Button btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();

        signupEmail = findViewById(R.id.reg_email);
        signupNumber = findViewById(R.id.reg_mobile);
        signupPassword = findViewById(R.id.reg_password);

        btnSignup = findViewById(R.id.reg_button);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signupUser(signupEmail.getText().toString(),signupNumber.getText().toString(),signupPassword.getText().toString());
            }
        });




    }

    private void signupUser(String email, String mobile, String password) {

    }
}
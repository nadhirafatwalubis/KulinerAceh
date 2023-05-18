package com.example.kulineraceh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText etUserName, etPassword;
    private Button btnLogin;
    private String username = "Nadhira Putri";
    private String password = "Admin";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUserName.getText().toString().equalsIgnoreCase(username) && etPassword.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(login.this, Makanan.class);
                    startActivity(login);

                    Toast.makeText(login.this, "LOGIN BERHASIL!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(login.this, "Username atau Password yang Anda Masukkan Salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

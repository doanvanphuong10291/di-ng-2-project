package com.example.project1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projectnhom12.R;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register_Activity extends AppCompatActivity {
    EditText edtUser;
    EditText edtPasswork;
    Button btnuHuy;
    Button btnDangKy;

    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseInstance;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registers_layout);

        edtUser = findViewById(R.id.edtUserRegister);
        edtPasswork = findViewById(R.id.edtPassword);
        btnuHuy = findViewById(R.id.btnHuy);
        btnDangKy= findViewById(R.id.btnRegister);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("users");
        firebaseInstance = FirebaseDatabase.getInstance();
        databaseReference = firebaseInstance.getReference();







    }
}

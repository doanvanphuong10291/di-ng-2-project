package com.example.project1.flagment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.Doctor_Activity;
import com.example.project1.Hostpital_Activity;
import com.example.project1.Myadmin;
import com.example.project1.data_models.Doctor;
import com.example.project1.data_models.Hostpital;

import com.example.projectnhom12.R;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    Button btnLogin,rigister;
    EditText edtname,edtpass;
    ArrayList<Doctor> data = new ArrayList<>();
    ArrayList<Hostpital> data1 = new ArrayList<>();
    RadioButton doctor,khachhang, admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        setControl();
        setEvent();
    }
    public void setControl()
    {
        btnLogin = (Button) findViewById(R.id.btnLogin);
        rigister = (Button) findViewById(R.id.btnRegister);
        edtname= (EditText)findViewById(R.id.edtUser);
        edtpass=(EditText)findViewById(R.id.edtPassword);
        doctor= (RadioButton) findViewById(R.id.rdbDoctor);
        khachhang =(RadioButton) findViewById(R.id.rdbKhachHang);
        admin =(RadioButton) findViewById(R.id.rdbAdmin);
    }
    public void setEvent()
    {
        KhoiTao();
        KhoiTao1();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(admin.isChecked())
                {
                    quatrangAdmin();
                }
                else if(khachhang.isChecked())
                {
                    quatrangNguoiDung();
                }
                else {
                    quatrangHospital();
                }
            }
        });
        rigister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
    }
    public void KhoiTao()
    {
        data.add(new Doctor("ho hoang hai","12345","aaa"));
    }
    public void KhoiTao1()
    {
        data1.add(new Hostpital("nv1","12345"));
        data1.add(new Hostpital("nguyenvanb","12345"));
    }
    public void quatrangAdmin()
    {

        for (int i = 0; i < data.size(); i++){
            if (edtname.getText().toString().trim().equals(data.get(i)) && edtpass.getText().toString().trim().equals(data.get(i)) )
           {
                Intent intent = new Intent(Login.this, Myadmin.class);
               startActivity(intent);
                break;
            }
            else {
                Toast.makeText(this, "Bạn đã nhập sai tài khoản hoặc mật khẩu!!! Vui lòng nhập lại", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void quatrangHospital()
    {

        for (int i = 0; i < data.size(); i++){
            if (edtname.getText().toString().trim().equals(data.get(i)) && edtpass.getText().toString().trim().equals(data.get(i)) )
            {
                Intent intent = new Intent(Login.this, Hostpital_Activity.class);
                startActivity(intent);
                break;
            }
            else {
                Toast.makeText(this, "Bạn đã nhập sai tài khoản hoặc mật khẩu!!! Vui lòng nhập lại", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void quatrangNguoiDung(){
        for (int i = 0; i < data.size(); i++){
            if (edtname.getText().toString().trim().equals(data1.get(i)) && edtpass.getText().toString().trim().equals(data1.get(i)) )
            {
                Intent intent = new Intent(Login.this, Doctor_Activity.class);
               startActivity(intent);
                break;
            }
            else {
                Toast.makeText(this, "Bạn đã nhập sai tài khoản hoặc mật khẩu!!! Vui lòng nhập lại", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

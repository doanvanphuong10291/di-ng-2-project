package com.example.project1.flagment;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project1.database.DatabaseLR;
import com.example.projectnhom12.R;

public class Register extends Fragment {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    EditText edtUser,edtPassword;
    Button btnHuy,btnRegister;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View flagment = null;
        flagment = inflater.inflate(R.layout.registers_layout,container,false);
        edtUser = flagment.findViewById(R.id.edtUser);
        edtPassword = flagment.findViewById(R.id.edtPassword);
        btnRegister = flagment.findViewById(R.id.btnRegister);
        btnHuy = flagment.findViewById(R.id.btnHuy);

        openHelper = new DatabaseLR(flagment.getContext());


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db = openHelper.getWritableDatabase();
                String dbUser = edtUser.getText().toString();
                String dbPassword = edtPassword.getText().toString();
                insertDatabase(dbUser,dbPassword);
                Toast.makeText(getActivity(),"Đăng ký thành công",Toast.LENGTH_SHORT).show();
            }
        });
        return flagment;


    }
    public void insertDatabase(String dbUser,String dbPassword)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseLR.USER,dbUser);
        contentValues.put(DatabaseLR.PASSWORD,dbPassword);
        long id = db.insert(DatabaseLR.TABLE_NAME,null,contentValues);
    }


}

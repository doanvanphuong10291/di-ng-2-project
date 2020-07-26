package com.example.project1.flagment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.example.project1.database.DatabaseLR;
import com.example.projectnhom12.R;

public class Login extends Fragment {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    EditText edtUser,edtPassword;
    Button btnLogin;
    TextView txtUser;
    Cursor cursor;
    Button btnregister;
    Intent intent;

        @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View flagment = null;
        flagment = inflater.inflate(R.layout.login_layout,container,false);
        txtUser = flagment.findViewById( R.id.txtUser);
        edtUser = flagment.findViewById(R.id.edtUser);
        edtPassword = flagment.findViewById(R.id.edtPassword);
        btnLogin = flagment.findViewById(R.id.btnLogin);
        btnregister = flagment.findViewById(R.id.btnRegister);
        openHelper = new DatabaseLR(flagment.getContext());
        db = openHelper.getReadableDatabase();


        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtUser.getText().toString();
                String pass = edtPassword.getText().toString();
                cursor = db.rawQuery( "SELECT * FROM " + DatabaseLR.TABLE_NAME + " WHERE " + DatabaseLR.USER +
                        " =? AND " + DatabaseLR.PASSWORD + " =? ",new String[]{user,pass});
                if(cursor!=null)
                {
                    if(cursor.getCount() > 0)
                    {
                        cursor.moveToNext();
                        Toast.makeText( getActivity(),"Login successfully",Toast.LENGTH_SHORT ).show();
                    }
                    else {
                        Toast.makeText( getActivity(),"Error",Toast.LENGTH_SHORT ).show();
                    }
                }
            }
        } );
//        btnregister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                intent.setClass(Login.this, Register.class);
//            }
//        });
        return flagment;

    }
}

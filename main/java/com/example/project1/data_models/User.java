package com.example.project1.data_models;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class User {
    private String sUser;
    private String sPassword;


    public User(String sUser, String sPassword) {
        this.sUser = sUser;
        this.sPassword = sPassword;
    }
    public User() {

    }


}

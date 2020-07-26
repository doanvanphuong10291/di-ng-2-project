package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.project1.flagment.Login;
import com.example.project1.flagment.Register;
import com.example.projectnhom12.R;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    Intent intent;
    ActionBarDrawerToggle drawerToggle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);



        drawerLayout = findViewById(R.id.drawLayout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home){
                    setTitle("Home");
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.frame_layout)
                }
                else if(id == R.id.login)
                {
                    setTitle("Đăng Nhập");
                    Login fragment = new Login();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout, fragment, "Login");
                    fragmentTransaction.commit();
                }
                else if(id == R.id.register)
                {
                    setTitle("Đăng Ký");
                    Register fragment = new Register();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout, fragment, "registration");
                    fragmentTransaction.commit();
                }

                return true;
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,R.string.mo,R.string.dong){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)){
            switch (item.getItemId()){
                case R.id.menuItemHome:
                    break;
                    case R.id.menuItemLogin:
                    break;
                    case R.id.menuItemRegister:
                    break;
                    case R.id.menuItemSetting:
                    break;
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

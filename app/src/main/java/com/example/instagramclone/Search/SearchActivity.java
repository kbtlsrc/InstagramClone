package com.example.instagramclone.Search;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagramclone.R;
import com.example.instagramclone.util.bottomNavigationDetail;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {

    private static final String TAG ="SearchActivity";
    private static final int ACTIVITY_NUM = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        bottomNavigation();
    }

    private void bottomNavigation(){
        Log.d(TAG,"BottomNavigationView setting up");
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationDetail.enableNavigation(SearchActivity.this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }

}

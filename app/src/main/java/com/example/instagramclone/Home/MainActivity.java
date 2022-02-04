package com.example.instagramclone.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.instagramclone.R;
import com.example.instagramclone.util.bottomNavigationDetail;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";

    private static final int ACTIVITY_NUM = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        bottomNavigation();
        setupViewPager();
    }

    private void setupViewPager(){
        SectionAdapter sectionAdapter = new SectionAdapter(getSupportFragmentManager());
        sectionAdapter.addFragment(new CameraFragment());
        sectionAdapter.addFragment(new HomeFragment());
        sectionAdapter.addFragment(new MessageFragment());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(sectionAdapter);

        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_insta);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_message);

    }

    private void bottomNavigation(){
        Log.d(TAG,"BottomNavigationView setting up");
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationDetail.enableNavigation(MainActivity.this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);



    }
}
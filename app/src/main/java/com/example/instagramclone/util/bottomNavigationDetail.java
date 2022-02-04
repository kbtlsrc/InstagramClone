package com.example.instagramclone.util;



import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.instagramclone.Like.LikesActivity;
import com.example.instagramclone.Home.MainActivity;
import com.example.instagramclone.Profile.ProfileActivity;
import com.example.instagramclone.R;
import com.example.instagramclone.Search.SearchActivity;
import com.example.instagramclone.Share.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottomNavigationDetail {
    private static final String TAG ="BottomNavigationDetail";

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.ic_on_home:
                        Intent intentHome =new Intent(context, MainActivity.class);
                        context.startActivity(intentHome);
                        break;

                    case R.id.ic_search:
                        Intent intentSearch = new Intent(context, SearchActivity.class);
                        context.startActivity(intentSearch);
                        break;

                    case R.id.ic_add:
                        Intent intentShare = new Intent(context, ShareActivity.class);
                        context.startActivity(intentShare);
                        break;

                    case R.id.ic_alert:
                        Intent intentLikes = new Intent(context, LikesActivity.class);
                        context.startActivity(intentLikes);
                        break;

                    case R.id.ic_profile:
                        Intent intentProfile= new Intent(context, ProfileActivity.class);
                        context.startActivity(intentProfile);
                        break;
                }

                return false;
            }
        });
    }
}

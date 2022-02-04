package com.example.instagramclone.Home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionAdapter extends FragmentPagerAdapter {
    private static final String TAG = "SectionsPagerAdapter";

    private final List<Fragment> FragmentList = new ArrayList<>();
    public SectionAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public SectionAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentList.size();
    }

    public void addFragment(Fragment fragment){
        FragmentList.add(fragment);
    }
}

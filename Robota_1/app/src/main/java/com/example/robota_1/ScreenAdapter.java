package com.example.robota_1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ScreenAdapter extends FragmentStateAdapter {

    public ScreenAdapter(@NonNull FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new FirstLayout();
            case 1: return new SecondLayout();
            default: return new ThirdLayout();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

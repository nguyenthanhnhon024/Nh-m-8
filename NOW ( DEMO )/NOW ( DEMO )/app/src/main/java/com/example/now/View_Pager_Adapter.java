package com.example.now;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class View_Pager_Adapter extends FragmentStatePagerAdapter {

    public View_Pager_Adapter(@NonNull FragmentManager fragmentManager, int behavior) {
        super(fragmentManager, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new Fragment_One();
                break;
            case 1:
                frag = new Fragment_Two();
                break;
            case 2:
                frag = new Fragment_Three();
                break;
            case 3:
                frag = new Fragment_Four()  ;
                break;

            default:
                frag = new Fragment_One();
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Gần tôi";
                break;
            case 1:
                title = "Bán chạy";
                break;
            case 2:
                title = "Đánh giá";
                break;
            case 3:
                title = "Giao nhanh";
                break;
        }
        return title;
    }
}

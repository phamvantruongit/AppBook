package vn.com.it.truongpham.appbook.sherlock.holmes;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerBook extends FragmentStatePagerAdapter {
    public ViewPagerBook(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragment_One();
                break;
            case 1:
                fragment = new Fragment_Two();
                break;
            case 2:
                fragment = new Fragment_Three();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Tập 1";
                break;
            case 1:
                title = "Tập 2";
                break;
            case 2:
                title = "Tập 3";
                break;
            default:
                return null;
        }
        return title;
    }
}

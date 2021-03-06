package com.hotbitmapgg.ohmybilibili.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hotbitmapgg.ohmybilibili.R;
import com.hotbitmapgg.ohmybilibili.module.home.bangumi.HomeBangumiFragment;
import com.hotbitmapgg.ohmybilibili.module.home.discover.HomeDiscoverFragment;
import com.hotbitmapgg.ohmybilibili.module.home.focus.HomeFocusFragment;
import com.hotbitmapgg.ohmybilibili.module.home.live.HomeLiveFragment;
import com.hotbitmapgg.ohmybilibili.module.home.partition.HomeMoreFragment;
import com.hotbitmapgg.ohmybilibili.module.home.recommend.HomeRecommendedFragment;

/**
 * Created by hcc on 16/8/4 14:12
 * 100332338@qq.com
 * <p/>
 * 主界面Fragment模块Adapter
 */
public class HomePagerAdapter extends FragmentPagerAdapter
{

    private final String[] TITLES;

    private Fragment[] fragments;

    public HomePagerAdapter(FragmentManager fm, Context context)
    {

        super(fm);
        TITLES = context.getResources().getStringArray(R.array.sections);
        fragments = new Fragment[TITLES.length];
    }

    @Override
    public Fragment getItem(int position)
    {

        if (fragments[position] == null)
        {
            switch (position)
            {
                case 0:
                    fragments[position] = HomeRecommendedFragment.newInstance();
                    break;
                case 1:
                    fragments[position] = HomeBangumiFragment.newInstance();
                    break;
                case 2:
                    fragments[position] = HomeLiveFragment.newIntance();
                    break;
                case 3:
                    fragments[position] = HomeFocusFragment.newIntance();
                    break;
                case 4:
                    fragments[position] = HomeMoreFragment.newInstance();
                    break;
                case 5:
                    fragments[position] = HomeDiscoverFragment.newInstance();
                    break;
                default:
                    break;
            }
        }
        return fragments[position];
    }

    @Override
    public int getCount()
    {

        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {

        return TITLES[position];
    }
}

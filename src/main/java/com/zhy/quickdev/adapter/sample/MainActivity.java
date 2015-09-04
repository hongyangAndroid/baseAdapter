package com.zhy.quickdev.adapter.sample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zhy.quickdev.adapter.R;

public class MainActivity extends AppCompatActivity
{

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private final int TAB_COUNT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager())
        {
            @Override
            public Fragment getItem(int i)
            {
                if (i == 1) return new MutliItemTypeFragment();
                return new SingleItemTypeFragment();
            }

            @Override
            public CharSequence getPageTitle(int position)
            {
                switch (position)
                {
                    case 0:
                        return "Single Item Type";
                    case 1:
                        return "Mutli Item Type";
                }
                return "Helloworld";
            }

            @Override
            public int getCount()
            {
                return TAB_COUNT;
            }
        });


        mTabLayout.setupWithViewPager(mViewPager);
    }


}

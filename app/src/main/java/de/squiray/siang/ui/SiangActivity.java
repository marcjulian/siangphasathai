package de.squiray.siang.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import de.squiray.siang.R;
import de.squiray.siang.ui.fragment.ConsonantsFragment;
import de.squiray.siang.ui.fragment.TonesFragment;
import de.squiray.siang.ui.fragment.VowelsFragment;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class SiangActivity extends BaseActivity {

    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPagerAdapter viewPageAdapter;

    private List<Integer> tabTitles;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siang);

        setupTabTitles();

        toolbar = (Toolbar) findViewById(R.id.mToolbar);
        toolbar.setTitle(tabTitles.get(0));
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.tab_viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager);
        }

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                toolbar.setTitle(tabTitles.get(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setupTabIcons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_overall, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent settings = new Intent(this, SettingsActivity.class);
            startActivity(settings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupTabTitles() {
        tabTitles = new ArrayList<>();
        tabTitles.add(R.string.tones_tab);
        tabTitles.add(R.string.vowels_tab);
        //tabTitles.add(R.string.vowels_combination_tab);
        tabTitles.add(R.string.consonants_tab);
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_tone);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_vowels);
        //tabLayout.getTabAt(2).setIcon(R.drawable.ic_vowel_combination);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_consonant);
    }

    private void setupViewPager(ViewPager viewPager) {
        viewPageAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPageAdapter.addFrag(new TonesFragment(), getString(R.string.tones_tab));
        viewPageAdapter.addFrag(new VowelsFragment(), getString(R.string.vowels_tab));
        //viewPageAdapter.addFrag(new VowelsCombinationFragment(), getString(R.string.vowels_combination_tab));
        viewPageAdapter.addFrag(new ConsonantsFragment(), getString(R.string.consonants_tab));
        viewPager.setAdapter(viewPageAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
            //return mFragmentTitleList.get(position);
        }

    }
}

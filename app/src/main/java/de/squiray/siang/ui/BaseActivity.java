package de.squiray.siang.ui;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import de.squiray.siang.R;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (!PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean(getString(R.string.pref_dark_theme), true)) {
            setTheme(R.style.AppThemeLight);
        }
        super.onCreate(savedInstanceState);
    }
}

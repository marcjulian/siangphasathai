package de.squiray.siang.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, SiangActivity.class);
        startActivity(intent);
        finish();
    }
}
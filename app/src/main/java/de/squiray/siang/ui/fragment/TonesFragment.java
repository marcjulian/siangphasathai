package de.squiray.siang.ui.fragment;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import de.squiray.siang.R;
import de.squiray.siang.audio.SiangPlayer;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class TonesFragment extends Fragment implements View.OnClickListener {

    private SiangPlayer siangPlayer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tones, container, false);
        siangPlayer = new SiangPlayer(getContext());
        List<Button> buttons = new ArrayList<>();
        buttons.add((Button) view.findViewById(R.id.level_tone_mid));
        buttons.add((Button) view.findViewById(R.id.level_tone_low));
        buttons.add((Button) view.findViewById(R.id.level_tone_high));
        buttons.add((Button) view.findViewById(R.id.contour_falling));
        buttons.add((Button) view.findViewById(R.id.contour_rising));
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
        return view;
    }

    @Override
    public void onClick(View view) {
        int resid = -1;
        String prefToneSound = PreferenceManager.getDefaultSharedPreferences(getContext()).
                getString(getString(R.string.pref_tone_sound),
                        getString(R.string.pref_tone_sound_default));

        if (prefToneSound.equals(getString(R.string.pref_tone_sound_default))) {
            resid = getaaSound(view.getId());
        } else if (prefToneSound.equals(getString(R.string.pref_tone_sound_kaa))) {
            resid = getkaaSound(view.getId());
        }

        if (resid != -1) {
            siangPlayer.play(resid);
        }
    }

    private int getaaSound(int viewID) {
        int resid = -1;
        switch (viewID) {
            case R.id.level_tone_low:
                resid = R.raw.level_tone_low_aa;
                break;
            case R.id.level_tone_mid:
                resid = R.raw.level_tone_mid_aa;
                break;
            case R.id.level_tone_high:
                resid = R.raw.level_tone_high_aa;
                break;
            case R.id.contour_falling:
                resid = R.raw.contour_tone_falling_aa;
                break;
            case R.id.contour_rising:
                resid = R.raw.contour_tone_rising_aa;
                break;
            default:
                break;
        }
        return resid;
    }

    private int getkaaSound(int viewID) {
        int resid = -1;
        switch (viewID) {
            case R.id.level_tone_low:
                resid = R.raw.level_tone_low_kaa;
                break;
            case R.id.level_tone_mid:
                resid = R.raw.level_tone_mid_kaa;
                break;
            case R.id.level_tone_high:
                resid = R.raw.level_tone_high_kaa;
                break;
            case R.id.contour_falling:
                resid = R.raw.contour_tone_falling_kaa;
                break;
            case R.id.contour_rising:
                resid = R.raw.contour_tone_rising_kaa;
                break;
            default:
                break;
        }
        return resid;
    }
}

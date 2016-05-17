package de.squiray.siang.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import de.squiray.siang.R;
import de.squiray.siang.audio.SiangPlayer;
import de.squiray.siang.entity.SoundButton;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class ConsonantsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_consonants, container, false);
        SiangPlayer siangPlayer = new SiangPlayer(getContext());
        addClickListenerToButtons(view, siangPlayer);
        return view;
    }

    private void addClickListenerToButtons(View view, SiangPlayer siangPlayer) {
        List<SoundButton> consonantsSounds = new ArrayList<>();
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_p), R.raw.consonants_p).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ph), R.raw.consonants_ph).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ph1), R.raw.consonants_ph1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ph2), R.raw.consonants_ph2).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_b), R.raw.consonants_b).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_m), R.raw.consonants_m).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_w), R.raw.consonants_w).build());

        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_f), R.raw.consonants_f).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_f1), R.raw.consonants_f1).build());

        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_t), R.raw.consonants_t).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_th), R.raw.consonants_th).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_th1), R.raw.consonants_th1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_th2), R.raw.consonants_th2).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_th3), R.raw.consonants_th3).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_th4), R.raw.consonants_th4).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_th5), R.raw.consonants_th5).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_d), R.raw.consonants_d).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_d1), R.raw.consonants_d1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_r), R.raw.consonants_r).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_l), R.raw.consonants_l).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_l1), R.raw.consonants_l1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_s), R.raw.consonants_s).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_s1), R.raw.consonants_s1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_s2), R.raw.consonants_s2).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_s3), R.raw.consonants_s3).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_n), R.raw.consonants_n).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_n1), R.raw.consonants_n1).build());

        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_c), R.raw.consonants_c).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ch), R.raw.consonants_ch).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ch1), R.raw.consonants_ch1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ch2), R.raw.consonants_ch2).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_j), R.raw.consonants_j).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_j1), R.raw.consonants_j1).build());

        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_k), R.raw.consonants_k).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_kh), R.raw.consonants_kh).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_kh1), R.raw.consonants_kh1).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_kh2), R.raw.consonants_kh2).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_kh3), R.raw.consonants_kh3).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_ng), R.raw.consonants_ng).build());

        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_q), R.raw.consonants_q).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_h), R.raw.consonants_h).build());
        consonantsSounds.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.consonant_h1), R.raw.consonants_h1).build());
    }
}
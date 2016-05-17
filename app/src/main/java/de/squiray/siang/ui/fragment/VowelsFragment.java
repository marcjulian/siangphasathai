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
public class VowelsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vowels, container, false);
        SiangPlayer siangPlayer = new SiangPlayer(getContext());
        addClickListenerToButtons(view, siangPlayer);

        return view;
    }

    private void addClickListenerToButtons(View view, SiangPlayer siangPlayer) {
        List<SoundButton> vowelAudios = new ArrayList<>();
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.i_long), R.raw.vowel_i_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.i_short), R.raw.vowel_i_short).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.e_long), R.raw.vowel_e_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.e_short), R.raw.vowel_e_short).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɛ_long), R.raw.vowel_ae_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɛ_short), R.raw.vowel_ae_short).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.a_long), R.raw.vowel_a_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.a_short), R.raw.vowel_a_short).build());

        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɯ_long), R.raw.vowel_w_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɯ_short), R.raw.vowel_w_short).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɤ_long), R.raw.vowel_y_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɤ_short), R.raw.vowel_y_short).build());

        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.u_long), R.raw.vowel_u_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.u_short), R.raw.vowel_u_short).build());

        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.o_long), R.raw.vowel_o_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.o_short), R.raw.vowel_o_short).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɔ_long), R.raw.vowel_oe_long).build());
        vowelAudios.add(new SoundButton.Builder(siangPlayer,
                (Button) view.findViewById(R.id.ɔ_short), R.raw.vowel_oe_short).build());
    }

}
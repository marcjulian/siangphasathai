package de.squiray.siang.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import de.squiray.siang.R;
import de.squiray.siang.audio.SiangPlayer;
import de.squiray.siang.entity.VowelCombi;
import de.squiray.siang.ui.adapter.VowelCombiAdapter;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class VowelsCombinationFragment extends Fragment {

    private RecyclerView recyclerView;

    private SiangPlayer siangPlayer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_vowels_combination, container, false);
        siangPlayer = new SiangPlayer(getContext());
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        setupRecyclerView(setupVowelsCombi());
        // Inflate the layout for this fragment
        return rootView;
    }

    private List<VowelCombi> setupVowelsCombi() {
        List<VowelCombi> vowelCombis = new ArrayList<>();
        // TODO: get the correct sound
        //TODO: extract string to string.xml

        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("aau", R.raw.vowel_a_long).addExample("khâau", R.raw.vowel_a_long)
                .addExample("Laau", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("au", R.raw.vowel_a_long).addExample("mau", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ɔɔi", R.raw.vowel_a_long).addExample("khɔɔi", R.raw.vowel_a_long)
                .addExample("rɔɔi", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ooi", R.raw.vowel_a_long).addExample("ka-mooi", R.raw.vowel_a_long)
                .addExample("dooi cha-phɔ", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("eeu", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("eu", R.raw.vowel_a_long).addExample("reu", R.raw.vowel_a_long)
                .addExample("ʔeu", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ɛɛu", R.raw.vowel_a_long).addExample("mɛɛu", R.raw.vowel_a_long)
                .addExample("kɛɛu", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("iia", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ia", R.raw.vowel_a_long).addExample("tía", R.raw.vowel_a_long)
                .addExample("rian", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("iieu", R.raw.vowel_a_long).addExample("diieu", R.raw.vowel_a_long)
                .addExample("khiieu", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("iu", R.raw.vowel_a_long).addExample("hiu khâau", R.raw.vowel_a_long)
                .addExample("phiu", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ua", R.raw.vowel_a_long).addExample("tua", R.raw.vowel_a_long)
                .addExample("hua", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ui", R.raw.vowel_a_long).addExample("khui", R.raw.vowel_a_long)
                .addExample("khlùi", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("uai", R.raw.vowel_a_long).addExample("ruai", R.raw.vowel_a_long)
                .addExample("chûai", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ɯa", R.raw.vowel_a_long).addExample("chɯa", R.raw.vowel_a_long)
                .addExample("bɯa", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ɤɤi", R.raw.vowel_a_long).addExample("khɤɤi", R.raw.vowel_a_long)
                .addExample("lɤɤi", R.raw.vowel_a_long).build());
        vowelCombis.add(new VowelCombi.Builder().addVowelCombination("ɯai", R.raw.vowel_a_long).addExample("nɯai", R.raw.vowel_a_long)
                .addExample("mɯai", R.raw.vowel_a_long).build());


        return vowelCombis;
    }

    private void setupRecyclerView(List<VowelCombi> combis) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new VowelCombiAdapter(getContext(), combis, siangPlayer));
    }
}

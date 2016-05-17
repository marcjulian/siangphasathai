package de.squiray.siang.ui.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import de.squiray.siang.R;
import de.squiray.siang.audio.SiangPlayer;
import de.squiray.siang.entity.Sound;
import de.squiray.siang.entity.SoundButton;
import de.squiray.siang.entity.VowelCombi;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class VowelCombiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private SiangPlayer siangPlayer;
    private List<VowelCombi> combis;
    private Context context;

    public VowelCombiAdapter(Context context, List<VowelCombi> combis, SiangPlayer siangPlayer) {
        this.context = context;
        this.combis = combis;
        this.siangPlayer = siangPlayer;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.combi_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int buttonColor = getButtonColor(position);
        Log.i("VowelCombiAdapter", " " + buttonColor);
        ViewHolder viewHolder = (ViewHolder) holder;
        Button combiButton = viewHolder.getCombiButton();
        VowelCombi vowelCombi = combis.get(position);
        new SoundButton.Builder(siangPlayer, combiButton,
                vowelCombi.getVowelcombination().getSound()).build();
        combiButton.setBackgroundTintList(ColorStateList.valueOf(buttonColor));
        combiButton.setText(combis.get(position).getVowelcombination().getName());

        viewHolder.setExampleButtonsInvisible();
        List<Button> exampleButtons = viewHolder.getExampleButtons();
        List<Sound> examplesText = vowelCombi.getExamples();
        for (int i = 0; i < Math.min(exampleButtons.size(), examplesText.size()); i++) {
            Button exampleButton = exampleButtons.get(i);
            new SoundButton.Builder(siangPlayer, exampleButton,
                    examplesText.get(i).getSound()).build();
            exampleButton.setBackgroundTintList(ColorStateList.valueOf(buttonColor));
            exampleButton.setText(examplesText.get(i).getName());
            exampleButton.setVisibility(View.VISIBLE);
        }
    }

    private int getButtonColor(int position) {
        int[] buttonColors = {R.color.color_button, R.color.color_button_group_1,
                R.color.color_button_group_2, R.color.color_button_group_3,
                R.color.color_button_group_4, R.color.color_button_group_5};

        final int version = Build.VERSION.SDK_INT;
        if (version >= 23) {
            return ContextCompat.getColor(context, buttonColors[position % buttonColors.length]);
        } else {
            return context.getResources().getColor(buttonColors[position % buttonColors.length]);
        }
    }

    @Override
    public int getItemCount() {
        return combis.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private Button combiButton;
        private List<Button> exampleButtons;

        public ViewHolder(View itemView) {
            super(itemView);
            this.combiButton = (Button) itemView.findViewById(R.id.combi_name);
            this.exampleButtons = new ArrayList<>();
            exampleButtons.add((Button) itemView.findViewById(R.id.example_one));
            exampleButtons.add((Button) itemView.findViewById(R.id.example_two));
        }

        public Button getCombiButton() {
            return combiButton;
        }

        public List<Button> getExampleButtons() {
            return exampleButtons;
        }

        public void setExampleButtonsInvisible() {
            for (Button exampleButton : exampleButtons) {
                exampleButton.setVisibility(View.INVISIBLE);
            }
        }
    }
}

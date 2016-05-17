package de.squiray.siang.entity;

import android.view.View;
import android.widget.Button;

import de.squiray.siang.audio.SiangPlayer;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class SoundButton implements View.OnClickListener {

    private int sound;
    private SiangPlayer player;

    private SoundButton(Builder builder) {
        this.player = builder.player;
        builder.play.setOnClickListener(this);
        this.sound = builder.sound;
    }

    @Override
    public void onClick(View v) {
        player.play(sound);
    }


    public static class Builder {

        private SiangPlayer player;
        private Button play;
        private int sound;

        public Builder(SiangPlayer player, Button play, int sound) {
            this.player = player;
            this.play = play;
            this.sound = sound;
        }

        public SoundButton build() {
            return new SoundButton(this);
        }
    }
}

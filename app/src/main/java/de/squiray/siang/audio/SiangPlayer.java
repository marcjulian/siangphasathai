package de.squiray.siang.audio;

import android.content.Context;
import android.media.MediaPlayer;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class SiangPlayer {

    public MediaPlayer mediaPlayer;
    private Context context;

    public SiangPlayer(Context context) {
        this.context = context;
    }

    public void play(int resid) {
        if (mediaPlayer != null) {
            release();
        }
        mediaPlayer = MediaPlayer.create(this.context, resid);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                release();
            }
        });
        mediaPlayer.start();
    }

    public void release() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.release();
        mediaPlayer = null;
    }
}
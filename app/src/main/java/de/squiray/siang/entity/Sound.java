package de.squiray.siang.entity;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class Sound {

    private String name;
    private int sound;


    public Sound(String name, int sound) {
        this.name = name;
        this.sound = sound;
    }


    public String getName() {
        return name;
    }

    public int getSound() {
        return sound;
    }
}

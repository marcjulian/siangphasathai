package de.squiray.siang.entity;

import java.util.ArrayList;
import java.util.List;

/*******************************************************************************
 * Copyright (c) 2016 marcjulian
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE file for more info.
 *
 * @author Marc
 */
public class VowelCombi {

    private Sound vowelcombination;

    private List<Sound> examples;

    private VowelCombi(Builder builder) {
        this.vowelcombination = builder.vowelcombination;
        this.examples = builder.exampleList;
    }

    public Sound getVowelcombination() {
        return vowelcombination;
    }

    public List<Sound> getExamples() {
        return examples;
    }

    public static class Builder {

        private Sound vowelcombination;
        private List<Sound> exampleList = new ArrayList<>();

        public Builder addVowelCombination(String vowelcombination, int sound) {
            this.vowelcombination = new Sound(vowelcombination, sound);
            return this;
        }


        public Builder addExample(String exampleName, int sound) {
            this.exampleList.add(new Sound(exampleName, sound));
            return this;
        }

        public VowelCombi build() {
            return new VowelCombi(this);
        }
    }
}

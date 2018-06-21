package com.example.android.courtcounter;

public class Interpolator implements android.view.animation.Interpolator {
private double mAmplitude = 1;
private double mFrequency = 10;

        Interpolator(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
        }

public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
        Math.cos(mFrequency * time) + 1);
        }
}

package com.ahsanburney;

/**
 * Created by Kulsum on 6/8/2017.
 */
public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}

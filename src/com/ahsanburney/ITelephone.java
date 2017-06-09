package com.ahsanburney;

/**
 * Created by Kulsum on 6/8/2017.
 */
public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}

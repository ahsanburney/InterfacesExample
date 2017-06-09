package com.ahsanburney;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone bobsPhone;
        bobsPhone = new DeskPhone(12345);
        bobsPhone.powerOn();
        bobsPhone.callPhone(12345);
        bobsPhone.answer();

        System.out.println("======================");

        bobsPhone = new MobilePhone(24565);
        bobsPhone.powerOn();
        bobsPhone.callPhone(24565);
        bobsPhone.answer();
    }
}

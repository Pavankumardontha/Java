package com.timbuchalka;

public class Main {

    public static void main(String[] args) 
    {
       /* Lets create an interface of the telephone. We will use I before the naming of the interfaces just as a convention.*/
        Deskphone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }
}

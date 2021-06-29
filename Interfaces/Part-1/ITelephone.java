package com.timbuchalka;

/**
 * Created by dev on 27/09/15.
 */
public interface ITelephone 
{
    /*We will define just the methods that are gonna be used in this interface that a class that implements this interface needs to actually implement.We dont write code in the 
    interface. We just define the methods and overide all of these methods in the class that implements this interface.Notice that there is no public,private and protected for the 
    defined methods in the interface. We have to implement all the methods in the class that implements this interface.We will create a new class called deskphone which will 
    implement this interface.Lets get into that.*/
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}

package com.emuspawn.rockBrain.rockParts;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/18/13
 * Time: 9:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Pineal {
   Date clock = new Date();
    SimpleDateFormat bedTime = new SimpleDateFormat("HH.mm");

    public void whenBedTime(){
        System.out.println(bedTime.format(clock));
    }
}

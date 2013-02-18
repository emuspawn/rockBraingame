package com.emuspawn.rockBrain.rockParts;


import java.util.Calendar;

public class Heart {
    double cycles = .5;  //number of beats a second
    Boolean update = false;
    Calendar heart = Calendar.getInstance();
    long timeNow = heart.getTimeInMillis();
    long lastUpdate=heart.getTimeInMillis();
    double timePassed=0;
    public  Heart(){

    }
    public Heart(int i){
      int cycles = i;
    }

    public boolean beat(){
     Calendar beat = Calendar.getInstance();
     timeNow = beat.getTimeInMillis();
     timePassed = timeNow - lastUpdate;
        if(timePassed<=(1000/cycles)){
            update = false;

            return update;

        }
    else{
            update=true;
           // System.out.println("Time Passed:" timePassed);
            lastUpdate=timeNow;
            return update;
        }
   }
}
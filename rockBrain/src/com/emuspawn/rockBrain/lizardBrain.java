package com.emuspawn.rockBrain;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/12/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */

public class lizardBrain {
    int hindBrain = 0;
    Boolean alive = true;
    int hp = 20;
    int hunger = 0;
    int fatigue = 0;
    Boolean sleepTime = false;
    Boolean sleep = false;
    int sleepCounter = 0;
    public void brain(){
        tick ticker = new tick();
        if (ticker.statUpdate){
            fatigue++;
            hunger++;
            if(hunger>=20) {hp--;  hunger=20;}
            if(sleepTime)sleepCounter--;
            if(fatigue>=20){sleepTime = true; sleepCounter=5;}


        }
    }
    public int getHP(){
        return hp;
    }
    public void bandaid(){
        hp = hp+5;
    }
    public int getHunger(){
        return hunger;

    }
    public void feedMe(){
        hunger = hunger-5;
        if(hunger<0) hunger = 0;
    }
    public int getFatigue(){
        return fatigue;
    }
    public void sleepyTime(){
        fatigue = fatigue-5;
        if(fatigue<0) fatigue = 0;
    }
}

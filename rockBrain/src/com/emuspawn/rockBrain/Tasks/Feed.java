package com.emuspawn.rockBrain.Tasks;

import com.emuspawn.rockBrain.Objects.*;
import com.emuspawn.rockBrain.rockParts.*;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/17/13
 * Time: 1:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Feed extends Task{
    public Feed(){
        id = 2;
        name = "food";
        verb="eating";
        duration = 4;

    }

    public void run(Body b, Food f){
        int timeLeft = f.time;
        while(timeLeft>0){
        b.setHP(b.getHP()+f.HP);
        System.out.println(b.getName() + " is " + verb + "(" + timeLeft + "/" + f.time + "/nHP: " + b.getHP());
        }
    }
}

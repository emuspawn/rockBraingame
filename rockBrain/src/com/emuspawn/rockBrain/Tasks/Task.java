package com.emuspawn.rockBrain.Tasks;

import com.emuspawn.rockBrain.rockParts.*;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/16/13
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task {
    int id;
    String name;
    String verb;
    int duration;
    public Task(){
        id = 0;
        name = "boredom";
        verb="bored";
        duration = 4;

    }

    public void run(Body b){
        System.out.println(b.getName() + " is " + verb);
    }
}

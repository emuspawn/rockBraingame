package com.emuspawn.rockBrain.Tasks;

import com.emuspawn.rockBrain.rockParts.*;


public class Kill extends Task {

    public  Kill(){
        id = 0;
        name = "dying of boredom";
        duration = 4;
    }
   public void run(Body b){
        b.setHP(-3);
       System.out.println("It's a horrible day to be alive. HP: " + b.getHP());
   }
}

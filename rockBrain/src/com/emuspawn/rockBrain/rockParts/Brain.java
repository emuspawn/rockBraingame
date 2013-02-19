package com.emuspawn.rockBrain.rockParts;

import com.emuspawn.rockBrain.Objects.*;
import com.emuspawn.rockBrain.Tasks.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/16/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Brain {

    public void brain(){
        int beatz = 0;
      Body body = new Body();  //make the mind a body
      int brainActivity = 10;  //timer for brain
      Heart heart = new Heart();
        Pineal clock = new Pineal();
      while(body.alive){

       if(heart.beat()){

        body.bodyCycle();
        System.out.println("Ka thump thump" + " Beat: " + beatz);          //heartbeat debug

        body.judge(body);
        body.bodyEqualize();
           body.fullReport(body);


        beatz++;

        }
         //   else{System.out.println("nope");}         //Debug

        }

        System.out.println("Death");
        }



    public void judge(Body b){
        Food pants = new Food();
        Toy ball = new Toy();
        Organ[] needs = {b.Fun, b.HP};
        List<Organ> organs = new ArrayList<Organ>();
        Collections.sort(organs, new organSorter());
        System.out.println(needs[0].OID + needs[0].stat);
    }
    class organSorter implements Comparator<Organ>{
        public int compare(Organ organ, Organ organ2){
            return organ.stat -  organ2.stat;
        }
    }
}


package com.emuspawn.rockBrain.rockParts;


import java.util.Arrays;

public class Body {
    String name = "rockBrain";
    Boolean alive = true;
    /*
    old shitty method...or is it?
    Organ HP = new Organ("HP",1,10,0);
    Organ Food= new Organ("Food",2,10,0);
    Organ Sleep= new Organ("Sleep",3,5,0);
    Organ Thirst= new Organ("Thirst",4,5,0);
    Organ Fun= new Organ("Fun",5,15,0);
    Organ[] organs = {HP,Food,Sleep,Thirst,Fun};
     */
    Organ[] organs = {
            new Organ("HP",1,10,0),
            new Organ("Food",2,20,0),
            new Organ("Sleep",3,40,0),
            new Organ("Thirst",4,8,0),
            new Organ("Fun",5,30,0)
   };
    public Body() {}

    public void bodyCycle(){
        //inflicts stat decreasing
        organs[1].stat--;
        organs[2].stat--;
        organs[3].stat--;
        organs[4].stat--;

    }
    public void bodyEqualize(){
        for(int i = 0; i< organs.length; i++)  {
            if(organs[i].stat<=0){
                organs[i].stat = 0;
            }
            else if (organs[i].stat>= organs[i].maxStat){
                organs[i].stat = organs[i].maxStat;
            }


        }
    }
    }


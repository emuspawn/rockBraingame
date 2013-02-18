package com.emuspawn.rockBrain.rockParts;

import com.emuspawn.rockBrain.Objects.*;
import com.emuspawn.rockBrain.Tasks.*;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/16/13
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Body {
    String name = "Rock";
    Boolean alive = true;





    Organ HP = new Organ("HP",1,10,0);
    Organ Food= new Organ("Food",2,10,0);
    Organ Sleep= new Organ("Sleep",3,5,0);
    Organ Thirst= new Organ("Thirst",4,5,0);
    Organ Fun= new Organ("Fun",5,15,0);
    Organ[] organs = {HP,Food,Sleep,Thirst,Fun};

    public Body() {


    }

    public String getName(){return name;}
    public void setHP(){HP.stat = HP.stat+2;}
    public void setHP(int i){HP.stat = HP.stat +i; System.out.println("HP is now: " + getHP());}
    public int getHP(){return HP.stat;}
    public void killHP(){if(HP.stat<=0){HP.stat=0;}else {HP.stat--;} }
    public void setFood(){Food.stat = Food.stat+2;}
    public void setFood(int i){Food.stat = Food.stat+i;}
    public int getFood(){return Food.stat;}
    public void killFood(){if(Food.stat<=0){Food.stat=0;} else{Food.stat--;} }
    public void setSleep(){Sleep.stat = Sleep.stat+2;}
    public void setSleep(int i){Sleep.stat = Sleep.stat+i;}
    public void killSleep(){if(Sleep.stat<=0){Sleep.stat=0;} else {Sleep.stat--;}   }
    public int getSleep(){return Sleep.stat;}
    public void setThirst(){Thirst.stat = Thirst.stat+2;}
    public void setThirst(int i){Thirst.stat = Thirst.stat+i;}
    public int getThirst(){return Thirst.stat;}
    public void killThirst(){if(Thirst.stat<=0){Thirst.stat=0;} else{Thirst.stat--;} }
    public void setFun(){Fun.stat = Fun.stat+2;}
    public void setFun(int i){Fun.stat = Fun.stat+i;}
    public int getFun(){return Fun.stat;}
    public void killFun(){if(Fun.stat<=0){Fun.stat=0;} else{Fun.stat--;}}
    public void fullReport(Body b){
          System.out.println(HP.name + " " +HP.stat);
        System.out.println(Food.name + " " +Food.stat);
        System.out.println(Sleep.name + " " +Sleep.stat);
        System.out.println(Thirst.name + " " +Thirst.stat);
        System.out.println(Fun.name + " " +Fun.stat);

    }
public void bodyCycle(){
    killFood();
    killSleep();
    killFun();
    killThirst();
    bodyEqualize();
    if(getHP()<=0){
        alive=false;
    }
    if(getFood()<=3){
        killHP();
    }
   else if(getFood()<=Food.maxStat-5){
        feedMe();
    }

    System.out.println("thump thump." + this.getHP() + " many heartbeats left. Food: " + this.getFood() + "Fun: " + this.getFun());
}
public void feedMe(){
//TODO Make feedMe() look for food, then eat.
    //Check known locations for food.
    // knownLocations.foodSource();
    // will return

    System.out.println("I've Been fed!");

    }


    public void funMe(Toy f){
        int timeLeft = f.time;
        while(timeLeft>=0){
            this.setHP(f.HP);
            System.out.println(this.getName() + " is playing with " + f.name + "(" + timeLeft + "/" + f.time + ")\nFUn: " + this.getFun() );
            timeLeft--;
        }
        System.out.println("I've Been fed!");
    }

        public void judge(Body b){
            Food pants = new Food();
            Toy ball = new Toy();

            Arrays.sort(organs);
            System.out.println("JUDGEMENT: " + organs[0].name + " " + organs[0].stat);
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


package com.emuspawn.rockBrain.Objects;

import com.emuspawn.rockBrain.rockParts.Brain;
import com.emuspawn.rockBrain.rockParts.Heart;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/18/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Enviroment {
    Boolean heatDeath = true; //end the world?
    Tile[] xcor = new Tile[5];
    Tile[] ycor= new Tile[5];
    Brain brain1;
    FoodDispensor food = new FoodDispensor();
    public void genesis(){
        //make The Grid
        for(int i =0;i<xcor.length;i++){
            xcor[i] = new Tile(i, 0);
        }
        for(int i =0;i<ycor.length;i++){
            ycor[i] = new Tile(i, 0);
        }
        //Should be 'add user data here', amirite. Test data!
        brain1 = new Brain(3,3);

        System.out.println("brain created");
        brain1.placeBrain(4,4);
        System.out.println("brain placed");
        placeObject(food, 5,5);
    }
    public void live(){
        while(heatDeath){
            Heart spirit = new Heart();

           brain1.activity();
        }

    }
    public void moveBrain(Brain b, int posx, int posy){



    }
     public void placeObject(Object o,int x, int y){
         o.x =x;
         o.y = y;

     }
}

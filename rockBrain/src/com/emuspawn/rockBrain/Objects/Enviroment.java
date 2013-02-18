package com.emuspawn.rockBrain.Objects;

import com.emuspawn.rockBrain.rockParts.Brain;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/18/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Enviroment {
    Tile[] xcor = new Tile[5];
    Tile[] ycor= new Tile[5];

    public void genesis(){
        //make The Grid
        for(int i =0;i<xcor.length;i++){
            xcor[i] = new Tile(i, 0);
        }
        for(int i =0;i<ycor.length;i++){
            ycor[i] = new Tile(i, 0);
        }
        //Should be 'add user data here', amirite. Test data!
        Brain brain = new Brain(3,3);

        System.out.println("brain created");
        brain.placeBrain(4,4);
        System.out.println("brain placed");
    }
    public void live(){

    }
    public void moveBrain(Brain b, int posx, int posy){



    }

}

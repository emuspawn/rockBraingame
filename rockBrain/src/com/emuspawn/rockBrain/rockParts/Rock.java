package com.emuspawn.rockBrain.rockParts;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/21/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rock {
    int locX;
    int locY;
    int currentTask;
    Body body;
    Brain brain;
    Boolean empty = true;

public Rock genesis(int locationX, int locationY){
    locX = locationX;
    locY = locationY;
    Body body = new Body();
    Brain brain = new Brain();
    return this;
}
public void on(){
        body.bodyCycle();
        brain.activity();
    }
}
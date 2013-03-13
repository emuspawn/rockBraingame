package com.emuspawn.rockBrain.rockParts;

import com.badlogic.gdx.utils.Json;

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
    Body body = new Body();
    Brain brain = new Brain();
    public Heart heart = new Heart();
    Boolean empty = true;

    public void on() {
        if (heart.beat()) {
            body.bodyCycle();
            brain.activity();
            System.out.println(getStats());

        }
    }

    public void moveRock(int x, int y) {
        locX = x + locX;
        locY = y + locY;
    }

    public String getStats() {
        String com = new String();
        for (int q = 0; q < this.body.organs.length; q++) {
            // this.body.organs[q].name + ": " + this.body.organs[q].stat; + "\n"
            com += this.body.organs[q].name + ": " + this.body.organs[q].stat + "\n";
        }
        return com;
    }

    public void saveRock() {
        Json json = new Json();
        System.out.println(json.prettyPrint(this));
    }
}
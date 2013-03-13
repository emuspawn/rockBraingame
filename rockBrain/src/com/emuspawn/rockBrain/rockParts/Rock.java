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
    public String[] thought = {"dial tone", "dial tone", "dial tone", "dial tone", "dial tone"};
    Body body = new Body();
    public Brain brain = new Brain();
    public Heart heart = new Heart();
    Boolean empty = true;

    public void on() {
        if (heart.beat()) {
            body.bodyCycle();
            body.bodyEqualize();
            for (int i = 0; i < 5; i++) {
                thought[i] = brain.memory(i);
            }


        }
    }

    public void moveRock(int x, int y) {
        locX = x + locX;
        locY = y + locY;
    }

    public String getStats(int i) {
        String com = new String(this.body.organs[i].name + ": " + this.body.organs[i].stat);


        return com;
    }

    public void saveRock() {
        Json json = new Json();
        System.out.println(json.prettyPrint(this));
    }
}
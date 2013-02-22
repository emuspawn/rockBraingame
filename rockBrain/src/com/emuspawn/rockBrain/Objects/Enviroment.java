package com.emuspawn.rockBrain.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.tiled.TiledLayer;
import com.badlogic.gdx.graphics.g2d.tiled.TiledLoader;
import com.badlogic.gdx.graphics.g2d.tiled.TiledMap;
import com.emuspawn.rockBrain.rockParts.*;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/18/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Enviroment {
    Brain[]  brain = new Brain[3];     //THERE ARE THREE BRAINS
    Boolean heatDeath = true; //end the world?

    public void genesis(){
          System.out.println("It's alive!");
    }

}
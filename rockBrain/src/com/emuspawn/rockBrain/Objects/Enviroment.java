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
    Rock[]  rockList = new Rock[3];     //THERE ARE THREE BRAINS
    Boolean heatDeath = true; //end the world?

    public void genesis(){
          System.out.println("It's alive!");
    }
    public void createRock(){                           //click a button to add a rock
        for(int i = 0;rockList[i].empty();i++){
        rockList[i] = new Rock();
        rockList[i].genesis(0,0);



} }  }
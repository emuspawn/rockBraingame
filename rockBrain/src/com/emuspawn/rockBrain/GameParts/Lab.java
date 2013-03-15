package com.emuspawn.rockBrain.GameParts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.emuspawn.rockBrain.rockParts.Rock;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 3/15/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Lab {
    Weather weather = new Weather();
    Inventory inventory = new Inventory();
    FileHandle handle = Gdx.files.local("data/rock.txt");
    String labsave;
    Rock[] rock = new Rock[3];
    long timeNow;

    long timeSaved;
    Date date = new Date();
    long timePassedtemp = 120;  //time in minutes

    public void genesis() {
        for (int i = 0; i < rock.length; i++) {
            rock[i] = new Rock();
        }
    }

    public void labSave() {
        //map.save();
        String Rock1 = rock[0].save();
        String Rock2 = rock[1].save();
        String Rock3 = rock[2].save();
        // String inventory = inventory.save();
        timeSaved = new Date().getTime();
        timeSaved = timeSaved / 100;

        handle.writeString((Rock1 + "," + Rock2 + "," + Rock3 + "," + timeSaved), false);
    }

    public void labLoad() {
        timeNow = new Date().getTime();
        timeNow = timeNow / 100;
        sandsofTime();

    }


    private void sandsofTime() {
        int timePassed = (int) timeNow - (int) timeSaved; //timePassed in 15 minute chunks
        System.out.println("Now: " + timeNow + " Saved: " + timeSaved + " Passed:" + timePassed);
        for (int i = 0; i < timePassed; i++) {
            for (int r = 0; r < rock.length; r++) {
                rock[r].erode();
            }

            weather();
        }
        System.out.println(timeSaved + " " + timeNow + " " + timePassed);
    }

    public void weather() {
        System.out.println("weather change!");
    }
}

package com.emuspawn.rockBrain.GameParts;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 3/10/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameData {
    Boolean gameExists = false;

    public void load() {
        if (gameExists) {
            // Load file blah blah
            // New lab = file.lab
            // sandsoftime();   //checks lastTime vs newTime, runs linear update of stats.
        }
    }

    public class checkgame {
        //return file(Gdx.files.internal(save.rck)).exists = true;
    }

    public class sandsofTime {
        // int timePassed = TimeNow - lab.lastSaved;
        //  lab.erode(timePassed);
    }
}

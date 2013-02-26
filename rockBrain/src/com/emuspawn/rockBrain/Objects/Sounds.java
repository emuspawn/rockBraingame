package com.emuspawn.rockBrain.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/25/13
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class Sounds {

    public static Sound rock;


    public static void load () {

        rock = loadSound("rock.wav");
    }

    private static Sound loadSound (String filename) {
        return Gdx.audio.newSound(Gdx.files.internal("sounds/" + filename));
    }

    public static void play (Sound sound) {
        sound.play(1);
    }
}
package com.emuspawn.rockBrain.GameParts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class Sounds {
public static Sound rock;


    public static void load(){
        rock = load("sounds/rock.wav");

    }
    private static Sound load (String name) {
        return Gdx.audio.newSound(Gdx.files.internal(name));
    }
}
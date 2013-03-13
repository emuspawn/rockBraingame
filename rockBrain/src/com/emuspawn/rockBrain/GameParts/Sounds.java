package com.emuspawn.rockBrain.GameParts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class Sounds {
    public static Sound alert;


    public static void load() {
        //alert = Gdx.audio.newSound(Gdx.files.internal("sounds/rock.wav"));
        alert = load("rock");
    }

    private static Sound load(String name) {
        return Gdx.audio.newSound(Gdx.files.internal("sounds/" + name + ".wav"));
    }

    public static void play(Sound sound) {

        sound.play(1);
    }
}
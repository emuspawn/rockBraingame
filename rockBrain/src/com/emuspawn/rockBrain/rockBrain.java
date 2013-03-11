package com.emuspawn.rockBrain;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.emuspawn.rockBrain.GameParts.*;
import com.emuspawn.rockBrain.Screens.*;


public class rockBrain extends Game {
    public void create() {
        Sounds.load();
        Art.load();
        GameData.load();
        setScreen(new MenuScreen(this));
    }

    public void resize(int width, int height) {
    }

    public void render() {
       super.render();
    }

    public void pause() {
    }

    public void resume() {
    }

    public void dispose() {
        super.dispose();

        getScreen().dispose();
    }
}
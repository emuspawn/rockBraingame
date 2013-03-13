package com.emuspawn.rockBrain;


import com.badlogic.gdx.Game;
import com.emuspawn.rockBrain.GameParts.Art;
import com.emuspawn.rockBrain.GameParts.GameData;
import com.emuspawn.rockBrain.GameParts.Sounds;
import com.emuspawn.rockBrain.Screens.TestScreen;


public class rockBrain extends Game {
    public void create() {

        Sounds.load();
        Art.load();
        GameData.load();
        setScreen(new TestScreen(this));

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
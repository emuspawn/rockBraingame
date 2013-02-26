package com.emuspawn.rockBrain;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.emuspawn.rockBrain.Objects.ImageCache;
import com.emuspawn.rockBrain.Objects.Sounds;
import com.emuspawn.rockBrain.Objects.Stats;
import com.emuspawn.rockBrain.Tasks.*;


public class startGame extends Game {

    @Override
    public void create() {

        super.create();

        camera = new OrthographicCamera(1280, 720);
        camera.position.set(1280 * 0.5f, 720 * 0.5f, 0);

        screenWidth = 1280;
        screenHeight = 720;

        Sounds.load();
        ImageCache.load();

        Stats stats = new Stats(this);
        spriteBatch = new SpriteBatch();

        setScreen("MenuScreen");

    }

    @Override
    public void dispose() {
        if (screen != null) screen.dispose();
    }

    @Override
    public void pause() {
        if (screen != null) screen.pause();
    }

    @Override
    public void render() {
        if (screen != null) {
            screen.update(Gdx.graphics.getDeltaTime());
        } else {

            GLCommon gl = Gdx.gl;
            gl.glClearColor(0, 0, 0, 1);
            gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        }
    }

    @Override
    public void resize(int arg0, int arg1) {

    }

    @Override
    public void resume() {
        if (screen != null) screen.resume();
    }
}

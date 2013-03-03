package com.emuspawn.rockBrain;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Rectangle;
import com.emuspawn.rockBrain.Tasks.Game;

public class startGame extends Game {
     Sound rockSound;
    SpriteBatch batch;
    Texture sheet;
    TextureAtlas atlas;
    Rectangle rock1;
    OrthographicCamera camera;
    @Override
    public void create() {

        super.create();
        batch = new SpriteBatch();
        camera = new OrthographicCamera(1280, 720);
        camera.position.set(1280 * 0.5f, 720 * 0.5f, 0);
        setScreen("MenuScreen");
        rockSound = Gdx.audio.newSound(Gdx.files.internal("sounds/rock.wav"));
        atlas = new TextureAtlas(Gdx.files.internal("textures/rockTexture.txt"), Gdx.files.internal("textures"));


        rock1 = new Rectangle();
        rock1.x = 50;
        rock1.y = 50;
        rock1.width = 50;
        rock1.height = 50;
    }

    @Override
    public void dispose() {
    }

    @Override
    public void pause() {

    }

    @Override
    public void render() {


        Gdx.gl.glClearColor(3, 0, 0.2f, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(atlas.findRegion("rock1"), rock1.x, rock1.y);

       batch.end();
}
    @Override
    public void resize(int arg0, int arg1) {

    }

    @Override
    public void resume() {

    }
}

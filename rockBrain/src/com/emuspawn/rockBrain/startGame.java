package com.emuspawn.rockBrain;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Rectangle;
import com.emuspawn.rockBrain.Tasks.Game;
import com.emuspawn.rockBrain.rockParts.Body;
import com.emuspawn.rockBrain.rockParts.Brain;

public class startGame extends Game {
    Sound rockSound;
    SpriteBatch batch;
     TextureAtlas atlas;
       BitmapFont font;
    BitmapFont font2;
    Rectangle rock1;
    OrthographicCamera camera;
    String write;
    Brain labtest;
    @Override
    public void create() {

        super.create();
        batch = new SpriteBatch();
        camera = new OrthographicCamera(1280, 720);
        camera.position.set(1280 * 0.5f, 720 * 0.5f, 0);
        setScreen("MenuScreen");
        rockSound = Gdx.audio.newSound(Gdx.files.internal("sounds/rock.wav"));
        atlas = new TextureAtlas(Gdx.files.internal("textures/rockTexture.txt"), Gdx.files.internal("textures"));
        font = new BitmapFont(Gdx.files.internal("fonts/rockFont.fnt"),Gdx.files.internal("fonts/rockFont_0.png"), false);
        font2 = new BitmapFont(Gdx.files.internal("fonts/DefaultFond.fnt"),Gdx.files.internal("fonts/DefaultFond_0.tga"), false);
        rock1 = new Rectangle();
        rock1.x = 50;
        rock1.y = 50;
        rock1.width = 50;
        rock1.height = 50;
        write = Float.toString(rock1.getWidth());
        labtest = new Brain();
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
        font.draw(batch, labtest.getStats() , 0f, 50f);
        font2.draw(batch, "i dunno which IS better" , -0f, 0f);
       batch.end();
        labtest.activity();
}
    @Override
    public void resize(int arg0, int arg1) {

    }

    @Override
    public void resume() {

    }
}

package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.emuspawn.rockBrain.GameParts.Art;


    public class GameScreen implements Screen {
        Game game;
        Vector3 touchPoint;
        OrthographicCamera guiCam;
        Rectangle enterGarden;
        SpriteBatch batch;

        public GameScreen (Game game) {
            this.game = game;
            guiCam = new OrthographicCamera(500, 500);
            guiCam.position.set(500 / 2, 500 / 2, 0);
            touchPoint = new Vector3();
            enterGarden = new Rectangle(0,0,50,50);
            batch = new SpriteBatch();
        }

    public void render(float delta) {
        draw(delta);
        update(delta);
    }

    public void resize(int width, int height) {
    }

    public void show() {
    }

    public void hide() {
    }

    public void pause() {
    }

    public void resume() {
    }

    public void dispose() {
    }
        public void draw(float delta){
            GLCommon gl = Gdx.gl;
            gl.glClearColor(1, 0, 0, 1);
            gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
            guiCam.update();
            batch.setProjectionMatrix(guiCam.combined);

            batch.disableBlending();
            batch.begin();
            batch.draw(Art.t("gardenBG"), 0, 0, 500, 500);
            batch.end();

            batch.enableBlending();
            batch.begin();
            batch.draw(Art.t("rock1"), 125, 300);

            batch.end();
        }
        public void update(float delta){}
}
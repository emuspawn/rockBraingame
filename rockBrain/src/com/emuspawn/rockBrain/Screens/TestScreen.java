package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.emuspawn.rockBrain.GameParts.Art;
import com.emuspawn.rockBrain.GameParts.GameSprite;
import com.emuspawn.rockBrain.GameParts.gDraw;


public class TestScreen implements Screen {
    Game game;
    Vector3 touchPoint;
    OrthographicCamera guiCam;
    gDraw gDraw;
    GameSprite enterbutton;
    GameSprite settings;

    public TestScreen(Game game) {
        this.game = game;
        guiCam = new OrthographicCamera(500, 500);
        guiCam.position.set(500 / 2, 500 / 2, 0);
        touchPoint = new Vector3();

        enterbutton = new GameSprite("enerGarden", 250, 250);
        settings = new GameSprite("settingButton", 250, 200);
        gDraw = new gDraw(this);
    }

    public void update(float deltaTime) {


    }


    public void draw(float deltaTime) {
        GLCommon gl = Gdx.gl;
        gl.glClearColor(1, 0, 0, 1);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        guiCam.update();
        gDraw.setProjectionMatrix(guiCam.combined);
        gDraw.disableBlending();
        gDraw.begin();
        gDraw.draw(Art.t("titleBG"), 0, 0, 500, 500);
        gDraw.end();
        gDraw.enableBlending();
        gDraw.begin();
        gDraw.g(enterbutton);
        gDraw.g(settings);
        gDraw.end();
    }


    public void render(float delta) {
        update(delta);
        draw(delta);
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
}

package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector3;
import com.emuspawn.rockBrain.GameParts.*;
import com.emuspawn.rockBrain.rockParts.Rock;


public class CreateScreen implements Screen {
    Game game;
    Vector3 touchPoint;
    OrthographicCamera guiCam;
    gDraw gDraw;
    GameSprite settingsBG;
    GameSprite backButton;
    GameSprite saveButton;
    String status;
    BitmapFont rockfont = new BitmapFont(Gdx.files.internal("fonts/rockFont.fnt"),
            Gdx.files.internal("fonts/rockFont_0.png"), false);

    public CreateScreen(Game game) {
        this.game = game;
        guiCam = new OrthographicCamera(500, 500);
        guiCam.position.set(500 / 2, 500 / 2, 0);
        touchPoint = new Vector3();
        backButton = new GameSprite("back", 25, 25);
        gDraw = new gDraw(this);
        status = new String("no clicks");
        saveButton = new GameSprite("saveMe", 250, 150);
    }

    public void update(float deltaTime) {
        if (Gdx.input.justTouched()) {
            guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
            status = "Clicked mouse at x: " + touchPoint.x + " y: " + touchPoint.y;

            if (OverlapTester.pointInRectangle(backButton, touchPoint.x, touchPoint.y)) {
                Sounds.alert.play();

                game.setScreen(new MenuScreen(game));
                return;
            }
            if (OverlapTester.pointInRectangle(saveButton, touchPoint.x, touchPoint.y)) {
                Sounds.alert.play();
                Rock rock = new Rock();
                rock.saveRock();
                return;
            }
        }
    }


    public void draw(float deltaTime) {
        GLCommon gl = Gdx.gl;
        gl.glClearColor(1, 0, 0, 1);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        guiCam.update();
        guiCam.update();
        gDraw.setProjectionMatrix(guiCam.combined);
        gDraw.disableBlending();
        gDraw.begin();
        gDraw.draw(Art.t("settings"), 0, 0, 500, 500);
        gDraw.end();
        gDraw.enableBlending();
        gDraw.begin();
        rockfont.setColor(0, 0, 0, 1);
        rockfont.draw(gDraw, status, 200, 15);
        gDraw.g(backButton);
        gDraw.g(saveButton);
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

package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.emuspawn.rockBrain.GameParts.*;
import com.emuspawn.rockBrain.rockParts.Rock;


public class GameScreen implements Screen {
    Rock[] rockArray = new Rock[3];
    Game game;
    Vector3 touchPoint;
    OrthographicCamera guiCam;
    Rectangle enterGarden;
    gDraw g;
    String rockStatus;
    String status;
    GameSprite backButton;
    BitmapFont rockfont = new BitmapFont(Gdx.files.internal("fonts/rockFont.fnt"),
            Gdx.files.internal("fonts/rockFont_0.png"), false);
    Rock rock;
    Boolean start;
    Boolean rockexists;

    public GameScreen(Game game) {


        start = true;
        this.game = game;
        guiCam = new OrthographicCamera(500, 500);
        guiCam.position.set(500 / 2, 500 / 2, 0);
        touchPoint = new Vector3();
        enterGarden = new Rectangle(0, 0, 50, 50);
        g = new gDraw(this);
        backButton = new GameSprite("back", 25, 25);
        status = new String("no clicks");
        rock = new Rock();

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

    public void draw(float delta) {
        GLCommon gl = Gdx.gl;
        gl.glClearColor(1, 0, 0, 1);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        guiCam.update();
        g.setProjectionMatrix(guiCam.combined);
        g.disableBlending();
        g.begin();
        g.draw(Art.t("gardenBG"), 0, 0, 500, 500);
        g.end();
        g.enableBlending();
        g.begin();
        g.g(backButton);
        rockfont.draw(g, status, 0, 450);
        g.end();
    }

    public void update(float delta) {

        //Rock bullshit
        rock.on();
        status = rock.getStats();

        if (Gdx.input.justTouched()) {
            guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
            status = "Clicked mouse at x: " + touchPoint.x + " y: " + touchPoint.y;

            if (OverlapTester.pointInRectangle(backButton, touchPoint.x, touchPoint.y)) {
                Sounds.alert.play();

                game.setScreen(new MenuScreen(game));
                return;
            }
        }
    }


}
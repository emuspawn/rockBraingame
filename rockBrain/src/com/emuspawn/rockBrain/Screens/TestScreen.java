package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector3;
import com.emuspawn.rockBrain.GameParts.Art;
import com.emuspawn.rockBrain.GameParts.GameSprite;
import com.emuspawn.rockBrain.GameParts.OverlapTester;
import com.emuspawn.rockBrain.GameParts.gDraw;
import com.emuspawn.rockBrain.rockParts.Rock;


public class TestScreen implements Screen {
    Game game;
    Vector3 touchPoint;
    OrthographicCamera guiCam;
    gDraw gDraw;
    GameSprite quitbutton;
    Boolean once;
    Rock rock;

    public TestScreen(Game game) {
        once = true;
        this.game = game;
        guiCam = new OrthographicCamera(500, 500);
        guiCam.position.set(500 / 2, 500 / 2, 0);
        touchPoint = new Vector3();
        quitbutton = new GameSprite("quitMe", 250, 475);
        gDraw = new gDraw(this);
        BitmapFont rockfont = new BitmapFont(Gdx.files.internal("fonts/rockFont.fnt"),
                Gdx.files.internal("fonts/rockFont_0.png"), false);
        rock = new Rock();
    }

    public void update(float deltaTime) {

        if (once) {
            rock.genesis();
            System.out.println(rock.getFeels(rock.weather, 5));
            once = false;
        }
        if (Gdx.input.justTouched()) {
            guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
            if (OverlapTester.pointInRectangle(quitbutton, touchPoint.x, touchPoint.y)) {
                Gdx.app.exit();
                return;
            }
        }

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
        gDraw.g(quitbutton);
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

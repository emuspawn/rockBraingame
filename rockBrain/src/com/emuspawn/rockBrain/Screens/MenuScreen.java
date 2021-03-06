package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector3;
import com.emuspawn.rockBrain.GameParts.*;


public class MenuScreen implements Screen {
    Game game;
    Vector3 touchPoint;
    OrthographicCamera guiCam;
    gDraw gDraw;
    GameSprite enterbutton;
    GameSprite settings;
    GameSprite stats;
    GameSprite quitbutton;
    boolean justonce;
    ShapeRenderer shapes;
    String status;
    BitmapFont rockfont = new BitmapFont(Gdx.files.internal("fonts/rockFont.fnt"),
            Gdx.files.internal("fonts/rockFont_0.png"), false);

    public MenuScreen(Game game) {
        this.game = game;
        guiCam = new OrthographicCamera(500, 500);
        guiCam.position.set(500 / 2, 500 / 2, 0);
        touchPoint = new Vector3();
        stats = new GameSprite("statsMe", 250, 150);
        enterbutton = new GameSprite("enerGarden", 250, 250);
        settings = new GameSprite("settingButton", 250, 200);
        quitbutton = new GameSprite("quitMe", 250, 100);
        gDraw = new gDraw(this);
        justonce = true;
        shapes = new ShapeRenderer();
        status = new String("no clicks");
        checkRock();

    }

    public void update(float deltaTime) {
        if (Gdx.input.justTouched()) {
            guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
            status = "Clicked mouse at x: " + touchPoint.x + " y: " + touchPoint.y;
            if (OverlapTester.pointInRectangle(enterbutton, touchPoint.x, touchPoint.y)) {
                Sounds.alert.play();
                game.setScreen(new GameScreen(game));
                System.out.println("Clicked Enter Garden");
                return;
            }
            if (OverlapTester.pointInRectangle(settings, touchPoint.x, touchPoint.y)) {
                Sounds.alert.play();
                game.setScreen(new SettingsScreen(game));
                System.out.println("Clicked Settings");
                return;
            }
            if (OverlapTester.pointInRectangle(quitbutton, touchPoint.x, touchPoint.y)) {
                Gdx.app.exit();
                return;
            } else {
                System.out.println("Didn't Click Button");
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
        gDraw.draw(Art.t("titleBG"), 0, 0, 500, 500);
        gDraw.end();
        gDraw.enableBlending();
        gDraw.begin();
        gDraw.g(enterbutton);
        gDraw.g(settings);
        gDraw.g(stats);
        gDraw.g(quitbutton);
        rockfont.setColor(0, 0, 0, 1);
        rockfont.draw(gDraw, status, 200, 15);
        gDraw.end();
        if (justonce) {
            System.out.println(enterbutton.getBounds());
            justonce = false;

        }
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

    public Boolean checkRock() {
        return true;
    }
}

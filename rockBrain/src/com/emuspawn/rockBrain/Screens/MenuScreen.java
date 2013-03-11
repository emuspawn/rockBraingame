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
import com.emuspawn.rockBrain.GameParts.*;

public class MenuScreen implements Screen {
    Game game;
    Vector3 touchPoint;
    OrthographicCamera guiCam;
    Rectangle enterGarden;
    SpriteBatch batch;

    public MenuScreen (Game game) {
        this.game = game;
        guiCam = new OrthographicCamera(500, 500);
        guiCam.position.set(500 / 2, 500 / 2, 0);
        touchPoint = new Vector3();
        enterGarden = new Rectangle(0,0,50,50);
        batch = new SpriteBatch();
    }

    public void update (float deltaTime) {
        if (Gdx.input.justTouched()) {

            game.setScreen(new GameScreen(game));
           /* guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));

            if (OverlapTester.pointInRectangle(enterGarden, touchPoint.x, touchPoint.y)) {
                game.setScreen(new GameScreen(game));
                return;
            }   */
            }
        }


    public void draw (float deltaTime) {
        GLCommon gl = Gdx.gl;
        gl.glClearColor(1, 0, 0, 1);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        guiCam.update();
        batch.setProjectionMatrix(guiCam.combined);

        batch.disableBlending();
        batch.begin();
        batch.draw(Art.t("titleBG"), 0, 0, 500, 500);
        batch.end();

        batch.enableBlending();
        batch.begin();
        batch.draw(Art.t("enerGarden"), 125, 300);

        batch.end();
    }


    public void render (float delta) {
        update(delta);
        draw(delta);
    }

    public void resize (int width, int height) {
    }

    public void show () {
    }

    public void hide () {
    }

    public void pause () {

    }

    public void resume () {
    }


    public void dispose () {
    }
}

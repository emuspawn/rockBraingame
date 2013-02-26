package com.emuspawn.rockBrain.Screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.g2d.SpriteCache;
import com.emuspawn.rockBrain.startGame;
import com.emuspawn.rockBrain.Objects.GameSprite;



public class MenuScreen extends Screen {

    private SpriteCache _spriteCache;
    private int _spriteCacheIndex;

    public MenuScreen (startGame game) {
        super(game);
    }

    @Override
    public void createScreen() {
        if (elements.size() == 0) {

            GameSprite logo = new GameSprite ("rock1", _game, -50,-50);



              System.out.println("whoop");
            //OPTION 1: With SpriteBatch
            elements.add(logo);



        }
    }



    @Override
    public void update(float dt) {

        if (Gdx.input.justTouched()) {
            Gdx.app.log("A HIT!", "A MOST PALPABLE HIT");


        } else {
            GLCommon gl = Gdx.gl;
            gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
            gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

            _game.camera.update();
        }


} }
package com.emuspawn.rockBrain.Tasks;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.emuspawn.rockBrain.Objects.Stats;


public class Game implements ApplicationListener {

    public static final int GAME_STATE_PLAY = 0;
    public static final int GAME_STATE_PAUSE = 1;
    public static final int GAME_STATE_ANIMATE = 2;

    public Screen screen;

    public Stats gameData;
    public SpriteBatch spriteBatch;
    public OrthographicCamera camera;
    public int screenWidth = 0;
    public int screenHeight = 0;

    protected HashMap<String, Screen> _screens;


    public void create() {
        _screens = new HashMap<String, Screen>();

    }

    public void setScreen (String screenClassName) {

        screenClassName = "com.emuspawn.rockBrain.Screens."+screenClassName;
        Screen newScreen = null;


            newScreen = _screens.get(screenClassName);



    }


    public void update (float dt) {}


    public void dispose() {
        // TODO Auto-generated method stub
    }

    public void pause() {
        // TODO Auto-generated method stub
    }

    public void render() {
        // TODO Auto-generated method stub
    }

    public void resize(int arg0, int arg1) {
        // TODO Auto-generated method stub
    }

    public void resume() {
        // TODO Auto-generated method stub
    }
}
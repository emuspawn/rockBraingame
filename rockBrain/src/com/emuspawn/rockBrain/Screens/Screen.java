package com.emuspawn.rockBrain.Screens;
import com.emuspawn.rockBrain.Objects.GameSprite;
import com.emuspawn.rockBrain.startGame;

import java.util.ArrayList;
import java.util.List;


public abstract class Screen  implements com.badlogic.gdx.Screen {

    public List<GameSprite> elements;
    protected startGame _game;

    public Screen (startGame game) {
        this._game = game;
        elements = new ArrayList<GameSprite>();
    }

    public void pause () {};
    public void resume () {};
    public void dispose (){};
    public void hide (){};
    public void show (){};
    public void destroy () {};

    public abstract void createScreen ();
    public abstract void update (float dt);

    @Override
    public void render(float arg0) {
    }

    @Override
    public void resize(int arg0, int arg1) {
    }
}

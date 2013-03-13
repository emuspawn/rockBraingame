package com.emuspawn.rockBrain.GameParts;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 3/12/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class gDraw extends SpriteBatch {
    Screen _screen;

    public gDraw(Screen _screen) {
        this._screen = _screen;
    }

    public void g(GameSprite g) {
        this.draw(g.skin, g.x, g.y);
    }
}


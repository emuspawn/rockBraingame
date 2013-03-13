package com.emuspawn.rockBrain.GameParts;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.emuspawn.rockBrain.rockBrain;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 3/12/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class GameSprite {
    public boolean active;
    public boolean visible;
    public float x = 0;
    public float y = 0;
    public int width = 0;
    public int height = 0;

    public TextureRegion skin;
    public Rectangle body;

    protected rockBrain _game;

    public GameSprite(float x, float y) {
        //  _game = game;
        this.x = x;
        this.y = y;
        active = true;
        visible = true;
        skin = null;
    }

    public GameSprite(String skinName, float g, float h) {
        // _game = game;
        setSkin(skinName);
        active = true;
        visible = true;
        width = skin.getRegionWidth();
        height = skin.getRegionHeight();
        x = g - skin.getRegionWidth() * 0.5f;
        y = h - skin.getRegionHeight() * 0.5f;

    }

    public void setSkin(String skinName, int skinIndex) {
        setSkin(Art.f(skinName, skinIndex));
    }

    public void setSkin(String skinName) {
        setSkin(Art.t(skinName));
    }

    public void setSkin(TextureRegion texture) {
        this.skin = texture;
        width = skin.getRegionWidth();
        height = skin.getRegionHeight();
        x = x - skin.getRegionWidth() * 0.5f;
        y = y - skin.getRegionHeight() * 0.5f;
    }

    public Rectangle bounds() {
        return new Rectangle(x + width, y + height, width, height);
    }

    public String getBounds() {
        return "coords are left x: " + x + "right x: " + (x + width) + " upper y: " + y + "lower y: " + (y + height);
    }

    public void reset() {
    }

    public void update(float dt) {
    }

    public void show() {
    }

    public void hide() {
    }

    public void draw(SpriteBatch b, GameSprite g) {
        b.draw(g.skin, g.x, g.y);
    }

}

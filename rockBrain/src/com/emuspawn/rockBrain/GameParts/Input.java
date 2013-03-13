package com.emuspawn.rockBrain.GameParts;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class Input implements InputProcessor {
    public static final int ENTER = 0;
    public static final int ESCAPE = 1;
    /* //examples. Thanks Notch!
    public static final int UP = 0;

	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;

	public static final int JUMP = 4;
	public static final int SHOOT = 5;

	public static final int ESCAPE = 6;
    */

    public boolean[] buttons = new boolean[64];
    public boolean[] oldButtons = new boolean[64];

    public void set(int key, boolean down) {
        int button = -1;

        if (key == Keys.ENTER) button = ENTER;
         /* //examples. Thanks Notch!
		if (key == Keys.Y) button = JUMP;
		if (key == Keys.Z) button = JUMP;
		if (key == Keys.X) button = SHOOT;
		if (key == Keys.C) button = JUMP;
		if (key == Keys.A) button = JUMP;
		if (key == Keys.S) button = SHOOT;
		if (key == Keys.D) button = JUMP;
          */
        if (key == Keys.ESCAPE || key == Keys.MENU) button = ESCAPE;

        if (button >= 0) {
            buttons[button] = down;
        }
    }


    public boolean mouseMoved(int x, int y) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    public boolean touchDragged(int x, int y, int pointer) {
        return false;
    }

    public class userString implements com.badlogic.gdx.Input.TextInputListener {
        @Override
        public void input(String text) {
        }

        @Override
        public void canceled() {
        }
    }
}
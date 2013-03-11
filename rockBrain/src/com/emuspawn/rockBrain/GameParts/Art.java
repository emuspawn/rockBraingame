package com.emuspawn.rockBrain.GameParts;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Art {

    public static TextureAtlas art;

    public static void load () {
        String textureFile = "textures/rockTexture.pack";
        art = new TextureAtlas(Gdx.files.internal(textureFile), Gdx.files.internal("textures"));

    }

    public static TextureRegion t (String name) {
        return art.findRegion(name);
    }

    public static TextureRegion f (String name, int index) {

        return art.findRegion(name, index);
    }

}
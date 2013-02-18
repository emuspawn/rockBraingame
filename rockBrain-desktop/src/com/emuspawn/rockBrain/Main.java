package com.emuspawn.rockBrain;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.emuspawn.rockBrain.Objects.Enviroment;
import com.emuspawn.rockBrain.rockParts.Brain;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "rockBrain";
		cfg.useGL20 = false;
		cfg.width = 1280;
		cfg.height = 720;


		new LwjglApplication(new cortexCycle(), cfg);
        Enviroment lab = new Enviroment();
        lab.genesis();
	}
}

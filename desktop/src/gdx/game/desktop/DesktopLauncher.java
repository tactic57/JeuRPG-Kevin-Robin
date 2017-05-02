package gdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import gdx.game.RPG;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "RPG";
		/*
		config.width = 1920;
		config.height = 1080;
		config.fullscreen = true;
		*/
		config.width = 1080;
		config.height = 720;
		new LwjglApplication(new RPG(), config);
	}
}

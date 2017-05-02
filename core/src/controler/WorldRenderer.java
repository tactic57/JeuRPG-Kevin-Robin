package controler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WorldRenderer {
	private SpriteBatch batch;
	Texture img;

	public WorldRenderer() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	public void render(double delta) {

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

}

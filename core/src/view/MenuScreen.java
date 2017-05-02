package view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import gdx.game.RPG;

public class MenuScreen implements Screen {

	private SpriteBatch batch;
	private BitmapFont font;
	private int choix = 1;
	private RPG rpg;
	private String s;

	public MenuScreen(RPG rpg) {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.rpg = rpg;
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0, 0, 0, 0);

		batch.begin();
		
		font.draw(batch, "NOUVELLE PARTIE", 243, 310);
		
		font.draw(batch, "QUITTER", 243, 260);

		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			choix = 2;
		}
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			choix = 1;
		}

		if (choix == 1) {
			font.draw(batch, ">", 230, 310);
		}

		if (choix == 2) {
			font.draw(batch, ">", 230, 260);
		}

		if (Gdx.input.isKeyPressed(Keys.ENTER)) {
			if (choix == 1)
				rpg.setScreen(new GameScreen());
			else if (choix == 2)
				System.exit(0);
		}
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}

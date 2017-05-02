package view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import controler.WorldRenderer;

public class GameScreen implements Screen {
	WorldRenderer wr;

	public GameScreen(){
		wr = new WorldRenderer();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		wr.render(Gdx.graphics.getDeltaTime());
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

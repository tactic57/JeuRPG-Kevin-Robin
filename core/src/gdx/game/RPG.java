package gdx.game;

import com.badlogic.gdx.Game;

import view.MenuScreen;

public class RPG extends Game {
	
	public RPG(){
		
	}
	
	@Override
	public void create () {
		setScreen(new MenuScreen(this));
	}

}

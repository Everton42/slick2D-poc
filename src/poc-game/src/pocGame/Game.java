package pocGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{

	public static final String gameName = "Poc Game!";
	public static final int menu = 0;
	public static final int play = 1;
	
	public Game(String name) {
		super(name);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	}
	
	
	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		//first state
		this.enterState(menu);
	}
	
	public static void main(String[] args) {
		// the game's window
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(gameName));
			// window's size
			appgc.setDisplayMode(640, 360, false);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}




}

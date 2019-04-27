package pocGame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.Input;

public class Menu extends BasicGameState{
		Image title;
		Image playNow;
		Image exitGame;
		
		public Menu(int state) {
		
		}
		@Override
		public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
			title = new Image("res/panic.png");
			playNow = new Image("res/play-btn.png");
			exitGame = new Image("res/exit-btn.png");
		}
		@Override
		public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
			title.draw(200, 30, .8f);
			playNow.draw(255, 170, 0.3f);
			exitGame.draw(270,230,0.06f);
		}
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			int posX = Mouse.getX();
			int posY = Mouse.getY();
			
			if((posX>250&& posX<344) && (posY>143 && posY<180 )) {
				if(Mouse.isButtonDown(0)) {
					sbg.enterState(1);
				}
			}
			
			if((posX>270&& posX<325) && (posY>105 && posY<130 )) {
				if(Mouse.isButtonDown(0)) {
					System.exit(0);
				}
			}
		}
		@Override
		public int getID() {
			return 0;
		}
		
		
}

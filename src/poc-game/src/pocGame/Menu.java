package pocGame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.Input;

public class Menu extends BasicGameState{
		
		public Menu(int state) {
		
		}
		@Override
		public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{

		}
		@Override
		public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
			g.fillOval(75, 100, 100, 100);
			g.drawString("Click to Play Now!", 80, 70);

		}
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			Input input = gc.getInput();
			int xpos = Mouse.getX();
			int ypos = Mouse.getY();
			if((xpos>75&&xpos<175)&&(ypos>160&&ypos<260)) { 
				if(input.isMouseButtonDown(0)) {
					sbg.enterState(1);
				}
			}
		}
		@Override
		public int getID() {
			return 0;
		}
		
		
}

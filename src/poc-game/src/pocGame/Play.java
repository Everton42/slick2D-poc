package pocGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
	
		public Play(int state) {
			
		}
		@Override
		public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
			
		}
		@Override
		public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
			g.drawString("Let's Play!", 100, 100);
		}
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			
			
		}
		@Override
		public int getID() {
			return 1;
		}
}

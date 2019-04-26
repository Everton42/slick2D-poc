package pocGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.Input;

public class Menu extends BasicGameState{

		Image marvin;
		int marvinX = 100;
		int marvinY = 100;
		
		public Menu(int state) {
		
		}
		@Override
		public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
			marvin = new Image("res/marvin.png");
		}
		@Override
		public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
			g.drawString("Don't Panic!", 50, 50);
			g.drawImage(marvin, marvinX, marvinY);
		}
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			// get all informations from mouse and keyboard
			Input input = gc.getInput();
			if(input.isKeyDown(Input.KEY_UP)) {marvinY -= 1;}
			if(input.isKeyDown(Input.KEY_DOWN)) {marvinY += 1;}
			if(input.isKeyDown(Input.KEY_LEFT)) {marvinX -= 1;}
			if(input.isKeyDown(Input.KEY_RIGHT)) {marvinX += 1;}
			
		}
		@Override
		public int getID() {
			return 0;
		}
		
		
}

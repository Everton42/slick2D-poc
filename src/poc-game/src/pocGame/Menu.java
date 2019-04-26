package pocGame;

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
			g.drawString("Don't Panic!", 50, 50);
			//g.drawRect(50, 100, 60, 120);
			//g.drawOval(200, 130, 130, 80);
			Image marvin = new Image("res/marvin.png");
			g.drawImage(marvin, 100, 100);
		}
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

			Input input = gc.getInput(); 
			int mouseX = input.getMouseX(); 
			int mouseY = input.getMouseY(); 
			System.out.println(mouseX + ", " + mouseY);
			
		}
		@Override
		public int getID() {
			return 0;
		}
		
		
}

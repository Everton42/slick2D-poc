package pocGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
		
		Image whale, vase;
		Image worldMap;
		boolean quit = false;
		float whalePositionX = 0;
		float whalePositionY = 0;
		float shiftX = whalePositionX + 15;
		float shiftY = whalePositionY + 150;
		
		public Play(int state) {
			
		}
		@Override
		public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
			worldMap = new Image("res/map.png");
			whale = new Image("res/whale.png");
		}
		@Override
		public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
			worldMap.draw(whalePositionX,whalePositionY, 1.5f);
			whale.draw(shiftX,shiftY, .2f);
		//	g.drawString("X: " + whalePositionX + " Y: " + whalePositionY, 400, 50);
		
			if(quit == true) {
				g.drawString("Resume (R)", 250, 100);
				g.drawString("Menu (M)", 250, 150);
				g.drawString("Quit Game (Q)", 250, 200);
				if(quit == false) {
					g.clear();
				}
			}
		}
		@Override
		public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			Input input = gc.getInput();
			if(input.isKeyDown(Input.KEY_UP)) {
				whalePositionY += delta * .1f;
				
				if(whalePositionY > -2) {
					whalePositionY -= delta * .1f;
				}
			}
			if(input.isKeyDown(Input.KEY_DOWN)) {
				whalePositionY -= delta * .1f;
				if(whalePositionY < -115) {
					whalePositionY += delta * .1f;
				}
			}
			if(input.isKeyDown(Input.KEY_LEFT)) {
				whalePositionX += delta * .1f;
				if(whalePositionX > 3) {
					whalePositionX -= delta * .1f;
				}
			}
			if(input.isKeyDown(Input.KEY_RIGHT)) {
				whalePositionX -= delta * .1f;
				if(whalePositionX < -262) {
					whalePositionX += delta * .1f;
				}
			}
			
			if(input.isKeyDown(Input.KEY_ESCAPE)) {
				quit = true;
			}
			
			if(quit == true) {
				if(input.isKeyDown(Input.KEY_R)) {
					quit = false;
				}
				if(input.isKeyDown(Input.KEY_M)) {
					sbg.enterState(0);
					quit = false;
				}
				if(input.isKeyDown(Input.KEY_Q)) {
					System.exit(0);
				}
			}
			
		}
		@Override
		public int getID() {
			return 1;
		}
}

package frame;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;
import java.util.Random;



public class Draw {
	
	public static int x = 200;
	public static int y = 200;
	
	
	
	public static void drawSquare(int PosX, int PosY){

		int distance = PosY - Display.getHeight()/2;
		PosY = PosY - distance*2;
		
		
		 glBegin(GL_LINES);
		 
		 	Random dice = new Random ();
		 	glColor3f(dice.nextFloat(), dice.nextFloat(), dice.nextFloat());
		 	glVertex2i(PosX - 10, PosY + 10); glVertex2i(PosX + 10, PosY + 10); // top line
		 	glVertex2i(PosX - 10, PosY - 10); glVertex2i(PosX + 10, PosY - 10); //bottom line
		 	glVertex2i(PosX - 10, PosY + 10); glVertex2i(PosX - 10, PosY - 10); //right hand side
		 	glVertex2i(PosX + 10, PosY + 10); glVertex2i(PosX + 10, PosY - 10); //left hand side
			 
		glEnd();
	}
	
	
}

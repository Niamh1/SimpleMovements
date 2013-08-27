package frame;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;



public class InitFrame {
	
	public static void frame(){
		//makes frame
		try{
			
		Display.setDisplayMode(new DisplayMode(640, 480));
		Display.setTitle("Movements");
		Display.create();
		Display.setResizable(true);
		
		
		}catch(LWJGLException e){
			e.printStackTrace();
			Display.destroy();
		}
		
		initGL();
	}
	
	
	
	public static void initGL(){
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); 
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		
	}
	


}

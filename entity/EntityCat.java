package entity;

public class EntityCat extends Entity implements IEntityHandler {
	private boolean talking;
	
	public EntityCat(int x, int y){
		super(x,y);
		
		setTextureLocation("images/Cat.png");
	}
	
//	@Override
//	public Texture getTexture() {
//		return 
//	}
	public void moveToLeft(){
		if(x > 0){
			setPosition(this.x - 10, this.y);
		}
	}
	
	public void moveToRight(){
		if(x < 640 - this.getTexture().getImageWidth()){
			setPosition(this.x + 10, this.y);
		}
	}
	
	public void moveUp(){
		if(y > 0){
			setPosition(this.x, this.y - 10);
		}
	}
	
	public void moveDown(){
		if(y < 480 - this.getTexture().getImageHeight()){
			setPosition(this.x, this.y + 10);
		}
	}
	
	public boolean isJackStupid(){
		if (talking) {
			return true;			
		}
		else return true;
	}
}

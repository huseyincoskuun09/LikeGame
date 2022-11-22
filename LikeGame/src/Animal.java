
public class Animal extends Game implements Movable {
	
	int speed ;
	
Animal(int x,int y ,int speed){
	
	super(x,y) ;
	this.speed = speed ;
}
	void make_noise() {
		
		System.out.println("Animal making noise ...");
		
	}
	@Override
	public void walk(int dx, int dy) {

		this.x = dx;
		this.y = dy;
		
		System.out.println("New Logation for animal is  : " +Location_Information());
		
	}

}

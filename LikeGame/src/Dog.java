
public class Dog extends Animal implements Nailed,Furry{

	int licence_number ;
	Dog(int x, int y, int speed,int licence_number) {
		super(x, y, speed);
		
		this.licence_number = licence_number ;
	}
	
	@Override
	public void scratch() {
		
		System.out.println("Dog strach 1 time .");
		
	}
	@Override
	public void keep_warm() {
		
		System.out.println("The Dog warm itself by 3 degrees.");
	}
	

	
	
}

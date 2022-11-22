
public class Cat extends Animal implements Nailed,Furry {

	Cat(int x, int y, int speed) {
		super(x, y, speed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void scratch() {
		System.out.println("Cat scratched 2 times .");
	}
	
	@Override
	void make_noise() {
		super.make_noise();
		System.out.println("Miyavv");
	}
	@Override
	public void keep_warm() {
		
		System.out.println("The cat warmed itself by 2 degrees.");
	}
	
	

}

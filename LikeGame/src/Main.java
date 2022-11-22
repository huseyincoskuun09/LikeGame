import java.util.ArrayList;
import java.util.Random;

public class Main {
	static ArrayList<Game> gameobject = new ArrayList<Game>();
	static ArrayList<Movable> movableobject = new ArrayList<Movable>();
	
	static Random random = new Random();
	 
	public static void add_object(int type) {
		
		switch(type){
			
			case 0:
			Wall w = new Wall(random.nextInt(-10,10),random.nextInt(-10,10)) ;
			gameobject.add(w) ;
			break ;
			case 1 : 
			Cat c = new Cat(random.nextInt(-10,10),random.nextInt(-10,10),random.nextInt(3,7)) ;
			gameobject.add(c);
			movableobject.add(c);
			break ; 
			
			case 2 :
				
			Dog d = new Dog(random.nextInt(-10,10),random.nextInt(-10,10),random.nextInt(3,7),random.nextInt(-10,10)) ;
				gameobject.add(d);
				movableobject.add(d);
		}
		
		
		
	}

	public static void main(String[] args) {

		
		
		Game w1 = new Wall(0,0);
		Game w2 = new Wall(1,0);
		Game w3 = new Wall(2,0);
		Game w4 = new Wall(3,0);
		Game w5 = new Wall(4,0);
		Game w6 = new Wall(5,0);
		
		Cat c1 = new Cat(8,5,20) ;
		Cat c2 = new Cat(8,5,20) ;
		Cat c3 = new Cat(8,5,20) ;
		
		
		Dog d1 = new Dog(3,5,30,101003) ;
		Dog d2 = new Dog(4,5,20,101004) ;
		Dog d3 = new Dog(5,5,40,101005) ;
		Dog d4 = new Dog(6,5,60,101006) ;
		
		gameobject.add(w1);
		gameobject.add(w2);
		gameobject.add(w3);
		gameobject.add(w4);
		gameobject.add(w5);
		gameobject.add(w6);
		
		gameobject.add(c1) ;
		gameobject.add(c2);
		gameobject.add(c3);
		
		gameobject.add(d1);
		gameobject.add(d2);
		gameobject.add(d3);
		gameobject.add(d4);
		
	
		
		for(int i=0 ; i<gameobject.size(); i++) {
			
			gameobject.get(i).Draw();
			
			
		}
		for(int i=0 ; i< movableobject.size(); i++) {
			movableobject.get(i).walk(random.nextInt(-5,5), random.nextInt(-5,5));
		}
			
		}

}

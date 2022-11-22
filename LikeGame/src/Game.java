
public class Game {
	
	int x,y ;
	
	Game(int x,int y){
		
		this.x = x ;
		this.y = y ;
		
	}
	
	void Draw() {
		
		System.out.println("Game Object Drawn At : " + x +"  " +  y );
		
	}
	
	String Location_Information() {
		
    return ( x+ " " + y );

	}

}

package functionalProgramming;

interface Gorilla{
	String move();
}

class GorillaFamily{
	
	String walk = "walk";
	
	void everyonePlay(boolean baby) {
		String approach = "amble";
		//approach = "run";
		
		play(() -> walk);
		play(() -> baby? "hitch a ride" : "run");
		play(() -> approach);
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GorillaFamily g = new GorillaFamily();
		//System.out.println(g.walk);
		g.everyonePlay(true);

	}

}

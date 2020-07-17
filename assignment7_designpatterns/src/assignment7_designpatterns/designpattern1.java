package assignment7_designpatterns;

public class designpattern1 {
	
	public static void main( String[] args ) {
		sparrow_designpattern1 sparrow = new sparrow_designpattern1(); 
		playtoy_designpattern1 toy = new toy_designpattern1(); 
		birdsurvival_designpattern1 birdsurvival = new birdsurvival_designpattern1(sparrow); 
		System.out.println("Toy..."); 
		toy.squeak(); 
		System.out.println("Birdsurvival..."); 
		birdsurvival.squeak(); 
		System.out.println("Sparrow..."); 
		sparrow.fly(); 
		sparrow.makeSound(); 
    }

}

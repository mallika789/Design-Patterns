package assignment7_designpatterns;

public class birdsurvival_designpattern1 {
	bird_designpattern1 bird; 

    public void squeak() 
    { 
        bird.makeSound(); 
    } 
    public birdsurvival_designpattern1(bird_designpattern1 bird) 
    { 
        this.bird = bird; 
    }


}

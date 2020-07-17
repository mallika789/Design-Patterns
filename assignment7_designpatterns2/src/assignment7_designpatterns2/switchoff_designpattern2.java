package assignment7_designpatterns2;

public class switchoff_designpattern2 implements command_designpattern2{
	 switch_designpattern2 light;
	  public switchoff_designpattern2(switch_designpattern2 light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switch_off();
	  }

}

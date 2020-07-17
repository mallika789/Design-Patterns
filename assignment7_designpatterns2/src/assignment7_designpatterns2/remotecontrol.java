package assignment7_designpatterns2;

public class remotecontrol {
	  private command_designpattern2 command;
	  public void set_cmd(command_designpattern2 command){
	    this.command = command;
	  }
	  public void press(){
	    command.execute();
	  }

}

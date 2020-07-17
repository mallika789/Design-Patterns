package assignment7_designpatterns2;

public class designpatterns2 {
	public static void main( String[] args ) {
		remotecontrol control = new remotecontrol();
		switch_designpattern2 light = new switch_designpattern2();
		command_designpattern2 lightsOn = new switchon_designpattern2(light);
		command_designpattern2 lightsOff = new switchoff_designpattern2(light);
		control.set_cmd(lightsOn);
		control.press();
		control.set_cmd(lightsOff);
		control.press();
    }

}

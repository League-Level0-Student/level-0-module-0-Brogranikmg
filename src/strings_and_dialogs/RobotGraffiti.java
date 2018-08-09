package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot yummy = new Robot();
		yummy.penDown();
		yummy.setSpeed(100);
		yummy.turn(20);
		yummy.move(100);
		yummy.turn(140);
		yummy.move(100);
		yummy.turn(180);
		yummy.move(50);
		yummy.turn(-70);
		yummy.move(35);
		yummy.hide();
	}
}

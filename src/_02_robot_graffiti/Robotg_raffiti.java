package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robotg_raffiti {
    public static void main(String[] args) throws Exception {
    	Robot r2 = new Robot ();
    	r2.penDown();
    	r2.setSpeed(80);
    	r2.move(226);
    	r2.turn(90);
    for(int i=0; i<19;i++) {
    	r2.move(20);
    	r2.turn(10);
    }
    r2.hide();
    }}

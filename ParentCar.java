package Mypack;

public class ParentCar {
	int speed =0;
	int maxSpeed = 100;
	int minSpeed = 0;
	String engine = "V1";
	String color = "black";

	
		
	
		void accelerateSpeed() {
			speed = speed+1;
			System.out.println("Accelerate Speed" +speed);
		}
		void breakCar() {
			 speed--;
			System.out.println("Break car" +speed);
		}

		void stopCar() {
			speed = 0;
			System.out.println("Car is stopped" +speed);
		}

	}



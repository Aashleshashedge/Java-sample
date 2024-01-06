package Mypack;

public class Encapsulation {
	
	int speed = 0;
	String color = "black";

	public static void main(String[] args) {
	Encapsulation car = new Encapsulation ();
	car.color = "green";
	System.out.println("car current speed"+car.speed);
	car.accelerateSpeed();
	car.stopCar();
	}
	
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

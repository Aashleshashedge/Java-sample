package Mypack;

public class BMWCar extends ParentCar {
	
	boolean autoGearBox = true;

	public static void main(String[] args) {
	BMWCar bmwCar = new BMWCar();
	bmwCar.color = "red";
	bmwCar.accelerateSpeed();
	bmwCar.breakCar();
	System.out.println("Is auto car:" +bmwCar.autoGearBox);

	}
	
	void accelerateSpeed() {
		speed = speed +2;
		System.out.println("Accelerate Speed:" +speed);
	}

}

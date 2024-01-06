package Mypack;

public class Car {

	String carColor = "gray";
	
	Car(){
		
	}
	Car(String color){
		this.carColor = color;
	}
	
	public static void main(String[]args) {
		Car newCar = new Car();
		System.out.println("car color:"+newCar.carColor);
		
		Car newCar2 = new Car("red");
		System.out.println("car color:"+newCar2.carColor);
		
		
	}
}

package Mypack;

public class BasicOOP {
	
	//const
	BasicOOP(){
		System.out.println("Initializing object");
	}
	
	//Pram const
	BasicOOP(int i){
		System.out.println("i" +i);
	}
	public static void main(String[] args) {

		BasicOOP object = new BasicOOP();
		object.printSomething();

	}
//method1
	public void printSomething() {
		System.out.println("This is method 1");
	}
	//method2
	public void printSomething2() {
		System.out.println("This is method 2");
	}
}

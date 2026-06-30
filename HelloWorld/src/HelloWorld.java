
public class HelloWorld {

	int balance = 100;

	public static void main(String[] args) {

		System.out.println("inside main....START ");
		doSomething();
		System.out.println("inside main....END ");
	}

	static void doSomething() {
		System.out.println("HelloWorld.doSomething().....START");
		System.out.println("Doing something....");
		
		HelloWorld hello = new HelloWorld();
		hello.balance=230;
		
		System.out.println("HelloWorld.doSomething().....END");
	}

}

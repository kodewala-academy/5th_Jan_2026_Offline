package com.kodewala.hotstar.live;

public class User {

	static int counter = 0;

	static { // 1
		System.out.println(" I'm inside SIB 1........ Connection creation logic / file opening logics..");
	}

	// IIB
	{
	//	System.out.println(" inside IIB"); // 3
		counter = counter + 1;
	}

	public User() {
		// 1 line super()
		// 2 line call to IIB
	//	System.out.println(" I am inside constructor.."); // 4
		// logic to create an object
	}

	public static void main(String[] args) {
		System.out.println(" inside main"); // 2
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		// User user2 = new User();
		System.out.println(" total live users : " + counter);
	}

}

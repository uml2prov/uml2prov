package App;

import Stack.Person;
import Stack.Stack;

public class App {

	public static void main(String[] args) {
		Stack s = new Stack();
		for (int i = 0; i < 10; i++) {
			Person p = new Person("Carlos"+i);
			s.push(p);
			System.out.println("Carlos"+i+" has been added into " );
		}
	}

}

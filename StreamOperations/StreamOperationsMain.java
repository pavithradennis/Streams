package StreamOperations;

import java.util.ArrayList;

//main class to implement the methods
public class StreamOperationsMain {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			list.add(i);
		}

		// calling the odd function
		list.stream().filter(PerformStreamOperation.isOdd()).forEach(System.out::println);
		System.out.println("***");

		// calling the even function
		list.stream().filter(PerformStreamOperation.isEven()).forEach(System.out::println);
		System.out.println("***");

		// calling the palindrome function
		list.stream().filter(PerformStreamOperation.isPalindrome()).forEach(System.out::println);
		System.out.println("***");
	}
}

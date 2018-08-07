package StreamOperations;

import java.util.function.Predicate;

//class to include functions that need to be implemented
public class PerformStreamOperation {
	// function to check if entered integer is odd
	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = (element) -> {
			if (element % 2 == 0)
				return false;
			else
				return true;
		};
		return predicate;
	}

	// function to check if entered integer is even
	public static Predicate<Integer> isEven() {
		Predicate<Integer> predicate = (element) -> {
			if (element % 2 == 0)
				return true;
			else
				return false;
		};
		return predicate;
	}

	// function to check if entered integer is palindrome
	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (element) -> {
			return (Integer.toString(element))
					.equals(new StringBuilder(Integer.toString(element)).reverse().toString());
		};
		return predicate;
	}

}

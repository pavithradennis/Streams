package StreamIntegerOperations;

import java.util.ArrayList;
import java.util.function.Predicate;

public class IntegerOperations {

	public static void main(String[] args) 
	{
		ArrayList<Integer> integerList = new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			integerList.add(1+(int)(Math.random()*1000));
			Predicate<Integer> isEven = number -> (number%2 == 0);
			Predicate<Integer> isOdd = number -> (number%2 !=0);
			Predicate<Integer> isDivisibleBySix = number -> (number%6 ==0);
			Predicate<Integer> isLessThanTwelve = number -> (number<12);
			Predicate<Integer> isGreaterThanFifty = number -> (number >50);
			
			System.out.println("Integers in the list are:");
			integerList.stream().forEach(System.out::println);
			
			System.out.println("Even numbers in the list are:");
			integerList.stream().filter(isEven).forEach(System.out::println);
			
			System.out.println("Odd numbers in the list are:");
			integerList.stream().filter(isOdd).forEach(System.out::println);
			
			System.out.println("Divisible by 6 numbers in the list are:");
			integerList.stream().filter(isDivisibleBySix).forEach(System.out::println);
			
			System.out.println("Numbers in the list less than twelve are:");
			integerList.stream().filter(isLessThanTwelve).forEach(System.out::println);
			
			System.out.println("Numbers in the list greater than 50 are:");
			integerList.stream().filter(isGreaterThanFifty).forEach(System.out::println);
			
		}

	}

}

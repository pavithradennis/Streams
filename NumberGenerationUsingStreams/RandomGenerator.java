package NumberGenerationUsingStreams;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomGenerator 
{

	public static void main(String[] args)throws IOException
	{
		Random rand = new Random(); //random class to generate random numbers
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the path");
		String file_path = scanner.nextLine();
		
		WriteFile write_file = new WriteFile(file_path,true);
		for(int i=0;i<100;i++)
				{
			      write_file.writeToFile("" +rand.nextInt(50)); //syntax to generate 50 numbers
			      System.out.println("\n");
				}
		
		Scanner in = new Scanner(new File(file_path)); //to read the file
		Set<Integer> set = new TreeSet<>(); //to implement in collection
		
		while(in.hasNextInt())
		{
			set.add(in.nextInt());
		}
		
		in.close();
		set.stream().distinct().sorted().forEach(System.out::println); //to delete duplicated numbers and sort the random numbers.

	}

}

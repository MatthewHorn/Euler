package me.matthorn.euler.euler005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*2520 is the smallest number that can be divided by each of the numbers from 1
to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?*/

// I did this on paper, but I'll try to put what I did into code.

public class Program
{	
	static List<Integer> primes;
	
	public static void main(String[] args)
	{
		final int UP_TO = 10;
		
		primes = new ArrayList<>(Arrays.asList(2, 3));
	}
	
	private static void findPrimes(int upTo)
	{
		int k = 1, lower = 6 * k - 1, upper = 6 * k + 1;
		while (lower <= upTo)
		{
			
		}
	}
	
	/*private static boolean isPrime(int p)
	{
		final int LIMIT = (int) Math.sqrt(p);
		for (int prime : primes)
		{
			if (prime >= limit)
				return true;
		}
	}*/
}

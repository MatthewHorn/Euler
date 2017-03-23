package me.matthorn.euler.euler010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/

public class Program
{
	static List<Long> primes;
	static long sum;
	static int k;
	
	public static void main(String[] args)
	{
		primes = new ArrayList<>(Arrays.asList(2L, 3L));
		sum = 5;	// 2 and 3
		k = 1;
		
		addPrimes();
		System.out.println(sum);
	}
	
	private static void addPrimes()
	{
		long lower = 6 * k - 1, upper = 6 * k + 1;
		while (lower <= 2000000)
		{
			if (isPrime(lower))
			{
				primes.add(lower);
				sum += lower;
			}
			
			if (isPrime(upper))
			{
				primes.add(upper);
				sum += upper;
			}
			lower = 6 * ++k - 1;
			upper = 6 * k + 1;
		}
	}
	
	private static boolean isPrime(long n)
	{
		final long MAX = (long) Math.sqrt(n);
		for (long prime : primes)
		{
			if (prime > MAX)
				return true;
			if (n % prime == 0)
				return false;
		}
		return true;
	}
}

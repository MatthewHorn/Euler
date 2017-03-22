package me.matthorn.euler.euler007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that
the 6th prime is 13.

What is the 10 001st prime number?*/

public class Program
{
	static List<Long> primes;
	static int k, primeCount;
	
	public static void main(String[] args)
	{
		primes = new ArrayList<>(Arrays.asList(2L, 3L));
		k = 1;
		primeCount = 2;
		
		addPrimes(10001);
		System.out.println(primes.get(primes.size() - 1));
	}
	
	private static void addPrimes(int primeNum)
	{
		long upper, lower;
		while (primeCount < primeNum)
		{
			lower = 6 * k - 1;
			upper = 6 * k++ + 1;
			
			if (isPrime(lower))
			{
				primes.add(lower);
				++primeCount;
				if (primeCount == primeNum)
					return;
			}
			
			if (isPrime(upper))
			{
				primes.add(upper);
				++primeCount;
			}
		}
	}
	
	private static boolean isPrime(long n)
	{
		for (long prime : primes)
		{
			if (prime >= n)
				return true;
			if (n % prime == 0)
				return false;
		}
		return true;
	}
}

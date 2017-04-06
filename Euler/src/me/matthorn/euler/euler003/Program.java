package me.matthorn.euler.euler003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?*/

public class Program
{
	// Static this, static that; maybe this shouldn't be in Java..
	static List<Long> primes;
	static int k;
	
	public static void main(String[] args)
	{
		long target = 600851475143L, prime;
		PrimeStatus status = PrimeStatus.TWO_ADDED;
		primes = new ArrayList<>(Arrays.asList(2L, 3L));
		List<Long> factors = new ArrayList<>();
		k = 1;
		
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		while (target != 1)
		{
			if (status == PrimeStatus.TWO_ADDED)
				while (target % (prime = primes.get(primes.size() - 2)) == 0)
				{
					target /= prime;
					factors.add(prime);
				}
			if (status == PrimeStatus.ONE_ADDED || 
					status == PrimeStatus.TWO_ADDED)
				while (target % (prime = primes.get(primes.size() - 1)) == 0)
				{
					target /= prime;
					factors.add(prime);
				}
			status = addPrimes();
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(factors);
		System.out.printf("Took %d ms.\n", endTime - startTime);
	}
	
	private static PrimeStatus addPrimes()
	{
		long lower = 6 * k - 1, upper = 6 * k++ + 1;
		boolean lowerPrime = isPrime(lower), upperPrime = isPrime(upper);
		
		if (lowerPrime && upperPrime)
		{
			primes.add(lower);
			primes.add(upper);
			return PrimeStatus.TWO_ADDED;
		}
		else if (lowerPrime)
		{
			primes.add(lower);
			return PrimeStatus.ONE_ADDED;
		}
		else if (upperPrime)
		{
			primes.add(upper);
			return PrimeStatus.ONE_ADDED;
		}
		else
			return PrimeStatus.NONE_ADDED;
	}
	
	private static boolean isPrime(long n)
	{
		final long LIMIT = (long) Math.sqrt(n);
		long prime;
		for (int i = 0; i < primes.size() && (prime = primes.get(i)) < LIMIT; ++i)
			if (n % prime == 0) return false;
		return true;
	}
	
	private enum PrimeStatus
	{
		NONE_ADDED,
		ONE_ADDED,
		TWO_ADDED
	}
}

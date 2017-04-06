package me.matthorn.euler.euler020;

import java.math.BigInteger;

/*n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!*/

public class Program
{
	public static void main(String[] args)
	{
		BigInteger total = new BigInteger("1");
		BigInteger i = new BigInteger("1");
		final BigInteger limit = new BigInteger("100");
		
		while (i.compareTo(limit) < 1)
		{
			total = total.multiply(i);
			i = i.add(BigInteger.ONE);
		}
		
		char[] totalString = total.toString().toCharArray();
		int sum = 0;
		for (char c : totalString)
			sum += c - '0';
		System.out.println(sum);
	}
}

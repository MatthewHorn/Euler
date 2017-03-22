package me.matthorn.euler.euler006;

/*The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural
numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum.*/

public class Program
{
	public static void main(String[] args)
	{
		long squareSum = 0, sumSquare = 0;
		for (int i = 1; i <= 100; ++i)
		{
			squareSum += i * i;
			sumSquare += i;
		}
		sumSquare *= sumSquare;
		System.out.println(sumSquare - squareSum);
	}
}

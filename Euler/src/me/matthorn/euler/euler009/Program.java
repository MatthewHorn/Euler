package me.matthorn.euler.euler009;

/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class Program
{
	public static void main(String[] args)
	{
		// FIXME: This is fucking stupid.
		for (int a = 1; a < 1000; ++a)
			for (int b = a; b < 1000; ++b)
			{
				int c = (int) Math.sqrt(a * a + b * b);
				if (a + b + c == 1000 && (c * c == a * a + b * b))
					System.out.println(a * b * c);
			}
	}
}

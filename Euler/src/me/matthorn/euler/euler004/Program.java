package me.matthorn.euler.euler004;

/*A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/

public class Program
{
	public static void main(String[] args)
	{
		// "Et tu, Bruteforce?"
		int largest = 0;
		for (int i = 1; i < 1000; ++i)
			for (int j = 1; j < 1000; ++j)
				if (isPalindrome(i * j) && i * j > largest)
					largest = i * j;
		System.out.println(largest);
	}
	
	private static boolean isPalindrome(int n)
	{
		return Integer.toString(n).equals(reverse(Integer.toString(n)));
	}
	
	private static String reverse(String s)
	{
		char[] newChars = new char[s.length()];
		for (int i = 0; i < s.length(); ++i)
			newChars[s.length() - i - 1] = s.charAt(i);
		return new String(newChars);
	}
}

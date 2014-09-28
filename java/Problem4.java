import java.util.*;

public class Problem4 implements ProblemInterface {
	public void Run() {

		int largest = 0;

		for (int i = 999; i > 99; --i)
		{
			for (int j = 999; j > 99; --j)
			{
				if (isPalindrome(i * j))
				{
					if (i * j > largest)
					{
						largest = i * j;
					}
				}
			}
		}

		System.out.println(largest);
	}

	private boolean isPalindrome(long n)
	{
		List<Integer> digits = new ArrayList<Integer>();
			

		while (n > 0)
		{
			int digit = ((int)n) % 10;
			digits.add(digit);
			n = n / 10;
		}

		for (int i = 0; i < digits.size() / 2; ++i)
		{
			if (digits.get(i) != digits.get(digits.size() - 1 - i))
			{
				return false;
			}
		}

		return true;
	}
}

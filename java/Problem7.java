import java.util.*;

public class Problem7 implements ProblemInterface {
	public void Run() {

		int target = 10001;
		int current = 0;
		int currentPrime = 0;

		int i = 2;
		while (current <= target)
		{
			if (isPrime(i))
			{
				++current;
				currentPrime = i;
			}
			++i;
		}

		System.out.println(currentPrime);
	}

	private boolean isPrime(long n)
	{
		for (long i = 2; i < n / 2; ++i)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}

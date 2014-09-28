import java.util.*;

public class Primes{

	public static List<Integer> GetPrimes(int max)
	{
		System.out.println("Generating primes up to max of: " + max);
		boolean[] flags = new boolean[max + 1];
		flags[0] = false;
		flags[1] = false;
		for(int i = 2; i < flags.length; ++i)
		{
			flags[i] = true;
		}

		// Find next prime, then mark off all multiples
		int currentPrime = 2;

		while (currentPrime <= Math.sqrt(max))
		{
			for (int j = currentPrime * currentPrime; j < flags.length; j += currentPrime)
			{
				flags[j] = false;
			}

			currentPrime++;

			while (currentPrime < flags.length && !flags[currentPrime])
			{
				currentPrime++;
			}

			if (currentPrime >= flags.length)
			{
				break;
			}
		}

		List<Integer> values = new ArrayList<Integer>();

		for (int i = 2; i < flags.length; ++i)
		{
			if (flags[i])
			{
				values.add(i);
			}
		}

		return values;
	}
}

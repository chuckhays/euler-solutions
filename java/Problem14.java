import java.util.*;

public class Problem14 implements ProblemInterface {

	private HashMap<Long,Long> results = new HashMap<Long,Long>();
	public void Run() {

		long longestCount = 0;
		long longestValue = 0;
		for (long i = 1; i < 1000000; ++i)
		{
			long count = GetCount(i);
			
			if (count > longestCount)
			{
				longestCount = count;
				longestValue = i;
			}
		}

		System.out.println(longestValue);
	}

	private Long GetCount(Long n)
	{
		Long current = n;
		long count = 0;
		while (current != 1)
		{
			if (results.containsKey(current))
			{
				return count + results.get(current);
			}

			current = NextValue(current);
			++count;
		}

		results.put(n, count);
		return count;
	}

	private long NextValue(long i)
	{
		if (i % 2 == 0)
		{
			return i / 2;
		}
		else
		{
			return 3 * i + 1;
		}
	}

}

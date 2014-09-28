import java.util.*;

public class Problem12 implements ProblemInterface {
	public void Run() {

		int current = 1;
		int i = 2;

		while(true)
		{
			// check
			int divisorCount = 0;
			for (int divisor = 1; divisor <= Math.sqrt(current); ++divisor)
			{
				if (current % divisor == 0)
				{
					++divisorCount;
				}
			}

			if (divisorCount >= 250)
			{
				System.out.println(current);
				return;
			}

			current += i;
			++i;
		}


	}

}

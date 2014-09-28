import java.util.*;

public class Problem6 implements ProblemInterface {
	public void Run() {

		long sumOfSquares = 0;
		long sum = 0;

		for (int i = 0; i <= 100; ++i)
		{
			sum += i;
			sumOfSquares += i * i;
		}

		System.out.println(sum*sum - sumOfSquares);
	}
}

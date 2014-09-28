import java.util.*;

public class Problem10 implements ProblemInterface {
	public void Run() {

		// sum of all primes below 2000000
		System.out.println("Problem 10");

		List<Integer> primes = Primes.GetPrimes(2000000);
		long sum = 0;

		for (Integer i : primes)
		{
			sum += i;
		}

		System.out.println(sum);

	}

}

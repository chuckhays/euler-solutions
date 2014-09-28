public class Problem3 implements ProblemInterface {
	public void Run() {

		long largest = 0;
		long target = 600851475143L;
		long n = target;

		for(long i = 2; i * i <= n; ++i)
		{
			if (isFactor(i,n))
			{
				n = n / i;
				largest = i;
			}
		}

		if (n > largest)
		{
			largest = n;
		}

		System.out.println(largest);
	}

	private boolean isFactor(long divisor, long value)
	{
		return value % divisor == 0;
	}
}

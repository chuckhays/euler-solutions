import java.util.*;

public class Problem9 implements ProblemInterface {
	public void Run() {

		// a + b + c = 1000
		// a < b < c
		// a*a + b*b = c*c
		// Find the product
		
		for (int a = 1; a < 1000; ++a)
		{
			for (int b = a + 1; b < 1000; ++b)
			{
				int c = 1000 - a - b;
				if (c <= b)
				{
					continue;
				}

				if ((a * a + b * b) != (c * c))
				{
					continue;
				}

				System.out.println(a * b *c );
				return;
			}
		}
	}

}

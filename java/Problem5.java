import java.util.*;

public class Problem5 implements ProblemInterface {
	public void Run() {

		for (int i = 20 * 19; true; ++i)
		{
			boolean divisible = true;
			for (int j = 2; j <= 20; ++j)
			{
				if (i % j != 0)
				{
					divisible = false;
					break;
				}
			}
			if (divisible)
			{
				System.out.println(i);
				return;
			}
		}
	}
}

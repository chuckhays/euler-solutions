import java.util.*;

public class Problem15 implements ProblemInterface {

	private HashMap<Long,Long> results = new HashMap<Long,Long>();

	private long size = 20;
	public void Run() {


		System.out.println(GetCount(0,0));
	}

	private long GetCount(long x, long y)
	{

		long key = x + 100*y;

		if (results.containsKey(key))
		{
			return results.get(key);
		}

		long count = 0;


		if (y < size - 1)
		{
			// can go right
			long rightCount = GetCount(x, y + 1);
			count += rightCount;
		}		
		else
		{
			count += 1;
		}
		if (x < size - 1)
		{
			long downCount = GetCount(x + 1, y);
			count += downCount;
		}	
		else
		{
			count += 1;
		}

		results.put(key, count);
		return count;
	}
}

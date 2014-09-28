public class Program {
	public static void main( String[] args) {

		if (args.length != 1)
		{
			System.out.println("Pass in a single number which is the problem number.");
			return;
		}

		ProblemInterface problem = null;
		switch(args[0])
		{
			case "1":
				problem = new Problem1();
				break;
			case "2":
				problem = new Problem2();
				break;
			case "3":
				problem = new Problem3();
				break;
			case "4":
				problem = new Problem4();
				break;


			default:
				System.out.println("Unrecognized problem number.");
				break;
		}

		if (problem != null)
		{
			problem.Run();
		}
	}
}

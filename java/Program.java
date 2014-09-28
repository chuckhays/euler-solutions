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
			case "5":
				problem = new Problem5();
				break;
			case "6":
				problem = new Problem6();
				break;
			case "7":
				problem = new Problem7();
				break;
			case "8":
				problem = new Problem8();
				break;
			case "9":
				problem = new Problem9();
				break;
			case "10":
				problem = new Problem10();
				break;
			case "11":
				problem = new Problem11();
				break;
			case "12":
				problem = new Problem12();
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

package recursion.controller;

public class RecursionAppController
{

	public void start()
	{
		 for(int spot = 0; spot <= 7; spot ++)
		 {
		 long startTime = System.currentTimeMillis();
		 System.out.println("the " + spot + " position of the Fibonaccccccii sequence is: " 
         +getFib(spot)
		 + ". it took " 
		 + (System.currentTimeMillis() - startTime)/1000
		 + " seconds to calculate it.");
		 }

//		 for (int spot = 0; spot <= 7; spot++)
//		 {
//		 long startTime = System.currentTimeMillis();
//		 System.out.println("the " + spot + " position of the Factorial sequence is: " + getFactorial(spot) + ". it took " + (System.currentTimeMillis() - startTime) / 1000 + " seconds to calculate it.");
//		 }
//		 System.out.println((int) 1.0 / 0.00);

		 for (int spot = 1; spot <= 7; spot++)
		 {
		 long startTime = System.currentTimeMillis();
		 System.out.println("the " + spot + " position of the Fibonaccccccii loops sequence is: " + getFibLoops(spot + 1) + ". it took " + (System.currentTimeMillis() - startTime) / 1000 + " seconds to calculate it.");
		 }
		
//		for (int spot = 1; spot <= 7; spot++)
//		{
//			long startTime = System.currentTimeMillis();
//			System.out.println("the " + spot + " position of the Factorial loops sequence is: " + getFactLoops(spot + 1) + ". it took " + (System.currentTimeMillis() - startTime) / 1000 + " seconds to calculate it.");
//		}
//		System.out.println((int) 1.0 / 0.00);
	}

	private long getFib(int position)
	{
		if (position == 0 || position == 1)
		{
			return 1;
		} else
		{
			return getFib(position - 2) + getFib(position - 1);
		}
	}

	private double getFactorial(int value)
	{
		if (value == 0 || value == 1)
		{
			return 1;
		} else
		{
			return value * getFactorial(value - 1);
		}
	}

	public int getFibLoops(int value)
	{
		while (value > 1)
		{
			return getFibLoops(value - 2) + getFibLoops(value - 1);
		}
		return value;

	}

	public int getFactLoops(int value)
	{
		while (value > 1)
		{
			return value * getFactLoops(value - 1);
		}
		return value;

	}

}

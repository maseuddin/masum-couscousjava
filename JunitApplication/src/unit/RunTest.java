package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test // check if FindBig method returns right result
	public void runFindBig()
	{
		//assertequals check if first argument is equal to 2nd args
		assertEquals(200,Calculator.findBig(200,100));
	}

		@Test // check if FindSmall method returns right result
		public void runFindSmall()
		{
			//assertequals check if first argument is equal to 2nd args
			assertEquals(10,Calculator.findSmall(10,20));
}
		@Test // check if FindBiggest method returns right result
		public void runFindBiggest()
		{
			//assertequals check if first argument is equal to 2nd args
			assertEquals(20,Calculator.findBiggest(20,10,15));
		}
			@Test // check if FindBiggest method returns right result
			public void runFindMax(){
				int[] myArray= {100,20,30,500,150};
				assertEquals(40,Calculator.findMax(myArray));

		}
}
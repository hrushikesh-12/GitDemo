package practice;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class day1 
{
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");
		System.out.println("Hrushikesh");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("I am last in this suite");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
		System.out.println("Harke");
	}

}

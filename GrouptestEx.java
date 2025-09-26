package groupingintestng;

import org.testng.annotations.Test;

public class GrouptestEx 
{
	@Test
	public void Smoke()
	{
		System.out.println("Service plans");
	}
	
    @Test
	public void Sanity()
	{
    	System.out.println("Accessories");
	}

	@Test
    public void Regression()
	{
		System.out.println("Special Offers");
	}

}

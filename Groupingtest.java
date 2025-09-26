package groupingintestng;


	
	import org.testng.annotations.*;

	public class Groupingtest 
	{ 
	
		@Test(groups="softwarecompany")
	  public void infosys()
	  {
		  System.out.println("infosys"); 
	  }
		@Test(groups="softwarecompany")
	  public void wipro()
	  {
		  System.out.println("wipro"); 
	  }
		@Test(groups="Automobilecompany")
	   public void maruti()
	  {
		  System.out.println("maruti");
	  }
		@Test(groups="Automobilecompany")
	  public void audi()
	  {
		  System.out.println("audi");
	  }
	}





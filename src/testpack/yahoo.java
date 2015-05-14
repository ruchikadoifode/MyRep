package testpack;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yahoo {

	@BeforeTest
	public void print(){
		
		
		System.out.println("test print");
		throw new SkipException("skipp");
	}

@Test
public void aftertest(){
	System.out.println("afterskii");
}

}

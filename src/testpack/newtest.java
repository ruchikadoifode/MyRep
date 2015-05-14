package testpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class newtest {
  @Test
  public void f() {
	  System.out.println("before test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }
@AfterTest

public void aftertes() {
	  System.out.println("after test");
}


@AfterMethod
public void afterMethod() {
	  System.out.println("after method");



}

}

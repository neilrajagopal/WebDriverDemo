package testdata;

import org.testng.annotations.DataProvider;

public class TestDataa {


	  @DataProvider
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "mercury", "mercury","Welcome: Mercury Tours","London" },
	      new Object[] { "test", "testone","Welcome: Mercury Tours","Paris" },
	    };
	  }

}

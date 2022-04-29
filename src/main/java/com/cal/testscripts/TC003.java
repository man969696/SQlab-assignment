package com.cal.testscripts;

import org.testng.annotations.Test;
import com.cal.lib.General;

public class TC003 
{
	@Test
	public void tc003() throws Exception
	{ 
		  General obj = new General();
		  obj.OpenApplication();
		  obj.Addition();

	}

}

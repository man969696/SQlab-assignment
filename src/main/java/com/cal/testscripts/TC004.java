package com.cal.testscripts;

import org.testng.annotations.Test;
import com.cal.lib.General;

public class TC004 
{
	@Test
	public void tc004() throws Exception
	{
		  General obj = new General();
		  obj.OpenApplication();
		  obj.Subtraction();
	}

}

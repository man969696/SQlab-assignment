package com.cal.testscripts;

import org.testng.annotations.Test;
import com.cal.lib.General;

public class TC002
{
	@Test
	public void tc002() throws Exception
	{
		  General obj = new General();
		  obj.OpenApplication();
		  obj.Division();
	}

}

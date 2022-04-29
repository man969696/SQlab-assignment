package com.cal.testscripts;

import org.testng.annotations.Test;
import com.cal.lib.General;

public class TC001 
{
	@Test
	public void tc001() throws Exception 
	{
	  General obj = new General();
	  obj.OpenApplication();
	  obj.Multiplication();
	}
}

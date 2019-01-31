package com.crm.util;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.base.Testbase;

public class TestUtil extends Testbase {
	public static void takeScreenshotAtEndOfTest() throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir=System.getProperty("user.dir");
		FileUtils.copyFile(src, new File(currentdir+"/screenshot/"+System.currentTimeMillis() +".png"));
		
				
		
	}


}

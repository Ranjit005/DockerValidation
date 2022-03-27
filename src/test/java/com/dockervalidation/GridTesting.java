package com.dockervalidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTesting {
	
	@Test
	public void TestCase001() throws MalformedURLException
	{
		URL u=new URL("http://3.141.0.244:4444/");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		//ChromeOptions cap = new ChromeOptions(); 
		//cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE);
		RemoteWebDriver driver =new RemoteWebDriver(u,cap);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void TestCase002() throws MalformedURLException
	{
		URL u=new URL("http://3.141.0.244:4444/");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability("browserName", "firefox");
		//ChromeOptions cap = new ChromeOptions(); 
		//cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE);
		RemoteWebDriver driver =new RemoteWebDriver(u,cap);
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		
	}

}

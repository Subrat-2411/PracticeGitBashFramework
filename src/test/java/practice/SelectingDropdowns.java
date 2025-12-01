package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectingDropdowns {
	@BeforeSuite
	public void demo()
	{
		System.out.println("Bs");
	}
	@BeforeTest
	public void test1()
	{
		System.out.println("test annotation");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("test annotation");
	}
	@BeforeClass
	public void runclass2()
	{
		System.out.println("Class annotation");
	}
	@BeforeClass
	public void runclass1()
	{
		System.out.println("Class annotation");
	}
	
	@BeforeMethod
	public void runmethod1()
	{
		System.out.println("before method1 annotation");
	}
	
	@BeforeMethod
	public void runmethod2()
	{
		System.out.println("before method2 annotation");
	}
	@AfterMethod
	public void runamethod1()
	{
		System.out.println(" after method1 annotation");
	}
	@AfterMethod
	public void runbmethod2()
	{
		System.out.println("after method2 annotation");
	}
	
	@Test
	public void selectDropdowns()
	{
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Running @test annotation ");
	}
	@Test
	public void selectDropdowns2()
	{
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Running @test2 annotation ");
	}
	@AfterClass
	public void runcmethod1()
	{
		System.out.println(" after class1 annotation");
	}
	@AfterClass
	public void runcmethod2()
	{
		System.out.println("after class2 annotation");
	}
	
}

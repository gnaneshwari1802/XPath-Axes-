package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// xpath with axes
		//Locatting parent axes
		/*
		driver.findElement(By.xpath("//input[@id='name']/.")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@id='email']/.")).sendKeys("rahul@.com");
		driver.findElement(By.xpath("//input[@id='phone']/.")).sendKeys("1594686");
		*/
		//locating child axes
		//driver.findElement(By.xpath("//div[@class='wikipedia-searchtable']/child::wikipedia-input-box")).sendKeys("hi");
		//driver.findElement(By.xpath("//div[@class='form-group']/child::input")).sendKeys("rhul");
		
		Thread.sleep(2000);
		driver.close();
		

	}

}

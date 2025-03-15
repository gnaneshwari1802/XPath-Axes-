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

package day25; 
import java.util.List; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class XPathAxesDemo { 
public static void main(String[] args) { 
WebDriver driver=new ChromeDriver(); 
driver.get("https://money.rediff.com/gainers/bse/daily/groupa"); 
driver.manage().window().maximize(); 
//Self -Selects the current node 
String text=driver.findElement(By.xpath("//a[contains (text(), 'L&T')]/self::a")).getText(); 
System.out.println("Self: "+ text); //L&T 
//Parent - Selects the parent of the current node (always One) 
text=driver.findElement(By.xpath("//a[contains (text(), 'L&T')]/parent::td")).getText();// there is 
System.out.println("Parent: "+text); //L&T 
//Child Selects all children of the current node (One or many) 
List<WebElement> childs=driver.findElements (By.xpath("//a [contains (text(), 'L&T')]/ancestor:: tr/chi System.out.println("Number of child elements: "+childs.size());//5 
	//Ancestor Selects all ancestors (parent, grandparent, etc.) text-driver.findElement(By.xpath("//a[contains (text(), 'L&T')]/ancestor:: tr")).getText(); System.out.println("Ancestor: "+text); 
//Descendant Selects all descendants (children, grandchildren, etc.) of the current node List<WebElement> descendants driver.findElements (By.xpath("//a[contains (text(), 'L&T')]/ancestor::t System.out.println("Number of descendant nodes: "+descendants.size()); //7 
//Following -Selects everything in the document after the closing tag of the current node List<WebElement>followingnodes driver.findElements(By.xpath("//a[contains (text(), 'L&T")]/ancestor: System.out.println("Number of following nodes: "+followingnodes.size()); //267 
//Preceding Selects all nodes that appear before the current node in the document 
List<WebElement> precedings-driver.findElements(By.xpath("//a[contains(text(), 'L&T')]/ancestor 
System.out.println("Number of preceding nodes:"+precedings.size()); //31
	//Following-sibling Selects all siblings after the current node 
List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains (text(), 'L&T')]/ances System.out.println("Number of Following Siblings:"+followingsiblings.size()); //265 
//preceding-sibling Selects all siblings before the current node 
List<WebElement> precedingsiblings=driver.findElements (By.xpath("//a[contains (text(), 'L&T')]/ances System.out.println("Number of preceding sibling nodes: "+precedingsiblings.size()); //30 
driver.quit();
}
}

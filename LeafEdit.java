package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("username")).sendKeys("Testleaf");//u can use xpath or locators to append 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("krishna");//above line referred
	
		Boolean display=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")).isDisplayed();
		System.out.println("Element displayed is"+display);
		
		Boolean edit=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).isEnabled();
		System.out.println("edit is displayed or not"+edit);
		driver.close();

	}

}

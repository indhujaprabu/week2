package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestLeaf {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Page Title is " +driver.getTitle());
		driver.findElement(By.xpath("//a[@href='https://acme-test.uipath.com/logout\']")).click();
		driver.close();
	}

}

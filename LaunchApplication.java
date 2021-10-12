package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();// Download and set the path 
		 ChromeDriver driver=new ChromeDriver();//Launch the chromebrowser 
		 driver.get("http://en-gb.facebook.com/");
		 driver.manage().window().maximize();//maximize the window
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Add implicit wait
		
	     driver.findElement(By.linkText("Create New Account")).click();
	     driver.findElement(By.name("firstname")).sendKeys("Indhuja");
	     driver.findElement(By.name("lastname")).sendKeys("Prabu");
	   	 driver.findElement(By.name("reg_email__")).sendKeys("9176682700");
	   	 driver.findElement(By.name("reg_passwd__")).sendKeys("indhu");
	   	 WebElement eleday= driver.findElement(By.id("day"));
	   	 Select dd1=new Select(eleday);
	   	 dd1.selectByValue("16");
	   	 WebElement elemonth=driver.findElement(By.id("month"));
	   	 Select dd2=new Select(elemonth);
	   	 dd2.selectByValue("2");
	   	 WebElement eleyear= driver.findElement(By.id("year"));
	   	 Select dd3=new Select(eleyear);
	   	 dd3.selectByValue("1990");
	   	 //WebElement radio1=driver.findElement(By.id("u_3_2_zU"));
	   	 //Select dd4=new Select(radio1);
	   	 //radio1.click();
	   	 driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	   	
	}
	

}

package week2.day1;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("UserFirstName")).sendKeys("Indhuja");
		driver.findElement(By.name("UserLastName")).sendKeys("Prabu");
		driver.findElement(By.name("UserEmail")).sendKeys("indhu.new@gmail.com");
		WebElement elejobtitle= driver.findElement(By.name("UserTitle"));
		Select dd=new Select(elejobtitle);
		dd.selectByVisibleText("Marketing / PR Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("RadheKrishna");
		WebElement elemployee= driver.findElement(By.name("CompanyEmployees"));
		Select emp=new Select(elemployee);
		emp.selectByVisibleText("101 - 500 employees");
		driver.findElement(By.name("UserPhone")).sendKeys("9176682700");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
				//"//div[@class='checkbox-ui']"
	}

}

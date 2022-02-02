package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a [@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("Yaaruq");
		driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("Y");
		driver.findElement(By.xpath("//input [contains(@name,'email__')]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input [contains(@id,'password_')]")).sendKeys("Asdf.123");
		WebElement drop = driver.findElement(By.xpath("//select [contains(@id,'day')]"));
		Select a = new Select(drop);
		a.selectByValue("4");
		WebElement drop1 = driver.findElement(By.xpath("//select [contains(@id,'month')]"));
		Select b = new Select(drop1);
		b.selectByValue("5");
		WebElement drop2 = driver.findElement(By.xpath("//select [contains(@id,'year')]"));
		Select c = new Select(drop2);
		c.selectByValue("2017");
		driver.findElement(By.xpath("//label [text()='Female']")).click();
		driver.close();
	}

}

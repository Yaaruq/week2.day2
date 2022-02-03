package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();
		
	}

}

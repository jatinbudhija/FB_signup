package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 
{
	public static void main(String[] args) 
	{
		Class1 obj = new Class1();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\class recordings\\exe\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Jatin");
		WebElement second = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']"));
		second.sendKeys("Budhija");
		WebElement mob = driver.findElement(By.xpath("//*[@name='reg_email__' or @aria-label='Mobile number or email address']"));
		mob.sendKeys("9034199778");
		WebElement pass = driver.findElement(By.xpath("//input[@*='password' and @data-type='password']"));
		pass.sendKeys("pass@@@###1234");
		WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		obj.drop(dob, "19");
		WebElement month = driver.findElement(By.xpath("//select[@id='month' and @title='Month']"));
		obj.drop(month, "Aug");
		WebElement doy = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		obj.drop(doy, "1994");
		WebElement sex = driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']"));
		sex.click();
		WebElement signup = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		signup.click();
		
	}
	public void drop(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

}

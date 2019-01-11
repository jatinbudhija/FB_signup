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
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jatin");
		WebElement surname = driver.findElement(By.cssSelector("input[name='lastname']"));
		surname.sendKeys("Budhija");
		WebElement mob_no = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		mob_no.sendKeys("9034199778");
		WebElement pass = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		pass.sendKeys("1234567");
		WebElement drop1 = driver.findElement(By.cssSelector("select[name='birthday_day']"));
		obj.selectDrop(drop1, "19");
		WebElement drop2 = driver.findElement(By.cssSelector("select#month"));
		obj.selectDrop(drop2, "Aug");
		WebElement drop3 = driver.findElement(By.cssSelector("select#year"));
		obj.selectDrop(drop3, "1997");
		WebElement sex = driver.findElement(By.cssSelector("input[value='2']"));
		sex.click();
		WebElement signup = driver.findElement(By.cssSelector("button[name='websubmit']"));
		signup.click();
	}
	public void selectDrop(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);  // using visible text
	}
		
	}


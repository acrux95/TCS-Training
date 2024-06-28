package Exercises;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class TestWebForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		WebElement input1 = driver.findElement(By.id("first-name"));
		input1.sendKeys("John");
		
		WebElement input2 = driver.findElement(By.id("last-name"));
		input2.sendKeys("Doe");
		
		WebElement input3 = driver.findElement(By.id("job-title"));
		input3.sendKeys("QA Engineer");
		
		WebElement radioButton = driver.findElement(By.id("radio-button-2"));
		radioButton.click();
		
		WebElement checkBox = driver.findElement(By.id("checkbox-2"));
		checkBox.click();
		
		Select select= new Select(driver.findElement(By.id("select-menu")));
		select.selectByValue("4");
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("05/28/2019");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
		button.click();
		
//		driver.quit();
	}

}

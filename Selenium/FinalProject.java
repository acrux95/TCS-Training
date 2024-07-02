package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class FinalProject {
	int shortLap = 500;
	int medLap = 1000;
	int longtLap = 1500;
	String alertMessage;

	public String submit() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();

	//Login Page
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

		
		userName.sendKeys("standarduser");
		password.sendKeys("secretsauce");
		loginButton.click();
		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3"));
		errorMessage.getText();

		
		Thread.sleep(longtLap);
		WebElement errorButton = driver.findElement(By.xpath("//button[@class='error-button']"));
		errorButton.click();
		userName.clear();
		password.clear();
		Thread.sleep(longtLap);
		
		driver.navigate().refresh();
		WebElement userName1 = driver.findElement(By.id("user-name"));
		WebElement password1 = driver.findElement(By.id("password"));
		WebElement loginButton1 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		userName1.sendKeys("standard_user");
		password1.sendKeys("secret_sauce");
		Thread.sleep(longtLap);
		loginButton1.click();
		
		//Select Products Page
		Select select= new Select(driver.findElement(By.className("product_sort_container")));
		select.selectByValue("za");
		Thread.sleep(medLap);

		select.selectByValue("lohi");
		Thread.sleep(medLap);

		select.selectByValue("hilo");
		Thread.sleep(medLap);

		select.selectByValue("az");
		Thread.sleep(medLap);
		
		
		WebElement chooseArticle1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
		chooseArticle1.click();
		Thread.sleep(shortLap);
		
		WebElement chooseArticle2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
		chooseArticle2.click();
		Thread.sleep(shortLap);
		
		WebElement chooseArticle3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button"));
		chooseArticle3.click();
		Thread.sleep(shortLap);
		
		WebElement chooseArticle4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button"));
		chooseArticle4.click();
		Thread.sleep(shortLap);
		
		WebElement chooseArticle5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button"));
		chooseArticle5.click();
		Thread.sleep(shortLap);
		
		WebElement chooseArticle6 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button"));
		chooseArticle6.click();
		Thread.sleep(shortLap);
		
		driver.findElement(By.id("item_0_title_link")).click();
		Thread.sleep(shortLap);
		WebElement removeButton0 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		removeButton0.click();
		Thread.sleep(shortLap);
		removeButton0.click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		Thread.sleep(shortLap);
		
		driver.findElement(By.id("item_1_title_link")).click();
		Thread.sleep(shortLap);
		WebElement removeButton1 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		removeButton1.click();
		Thread.sleep(shortLap);
		removeButton1.click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		Thread.sleep(shortLap);
		
		driver.findElement(By.id("item_2_title_link")).click();
		Thread.sleep(shortLap);
		WebElement removeButton2 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		removeButton2.click();
		Thread.sleep(shortLap);
		removeButton2.click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		Thread.sleep(shortLap);
		
		driver.findElement(By.id("item_3_title_link")).click();
		Thread.sleep(shortLap);
		WebElement removeButton3 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		removeButton3.click();
		Thread.sleep(shortLap);
		removeButton3.click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		Thread.sleep(shortLap);
		
		driver.findElement(By.id("item_4_title_link")).click();
		Thread.sleep(shortLap);
		WebElement removeButton4 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		removeButton4.click();
		Thread.sleep(shortLap);
		removeButton4.click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		Thread.sleep(shortLap);
		
		driver.findElement(By.id("item_5_title_link")).click();
		Thread.sleep(shortLap);
		WebElement removeButton5 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		removeButton5.click();
		Thread.sleep(shortLap);
		removeButton5.click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//button[@class='inventory_details_back_button']")).click();
		Thread.sleep(shortLap);
		
		WebElement shoppingCar = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		shoppingCar.click();
		Thread.sleep(shortLap);

	
		//Shopping review page

		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[6]/div[2]/div[2]/button")).click();
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[8]/div[2]/div[2]/button")).click();
		Thread.sleep(medLap);
		
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();

		//Data Client Page

		WebElement nameInput = driver.findElement(By.id("first-name"));
		nameInput.sendKeys("Armando");
		Thread.sleep(shortLap);
		
		WebElement lastNameInput = driver.findElement(By.id("last-name"));
		lastNameInput.sendKeys("Cruz");
		Thread.sleep(shortLap);
		
		WebElement zipInput = driver.findElement(By.id("postal-code"));
		zipInput.sendKeys("06523");
		Thread.sleep(shortLap);
		
		driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input")).click();

		//Check
		Thread.sleep(shortLap);
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();

		//Thank you page

		Thread.sleep(shortLap);
		WebElement thankYou = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		
		return 
			thankYou.getText();
//			errorMessage.getText();
		
	}

}

package groupAutomated;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleAuto {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				   		   "C:\\Users\\jpax2\\Desktop\\Programing Practice\\Java\\Selenium WorkSpace\\SeleniumProject\\lib\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Creating a League
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("gm simulator nba");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'» Custom')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains (text(),'Random')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Create League')]")).click();
		//Need at least 10 seconds since it needs to load the game
		Thread.sleep(15000);
		
		Actions builder = new Actions(driver);
		builder
				.keyDown(Keys.ALT)
				.sendKeys("p")
				.keyUp(Keys.ALT)
				.build()
				.perform();
		
		//Checking the preseason roster and free agents
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Players')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'Free Agents')]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Team')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-item'][contains(text(),'Roster')]")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		
		builder
			.keyDown(Keys.ALT)
			.sendKeys("y")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		String Title = "Playoffs » 2020";
		
		Thread.sleep(40000);
		
		if (driver.getTitle().equals(Title))
			System.out.println("Good");
		else
			System.out.println("first");
		
		//playoffs begin
		Thread.sleep(2000);
		builder
			.keyDown(Keys.ALT)
			.sendKeys("y")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		//read message
		Thread.sleep(12000);
		builder
			.keyDown(Keys.ALT)
			.sendKeys("p")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		//draft begins
		Thread.sleep(5000);
		builder
			.keyDown(Keys.ALT)
			.sendKeys("y")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		//Draft picks
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Sim until')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'And Sim')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'And Sim')]")).click();
		
		
		//Free Agents
		Thread.sleep(4000);
		builder
			.keyDown(Keys.ALT)
			.sendKeys("p")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Negotiate')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='d-flex align-items-center list-group-item list-group-item-success']//span[@class='d-none d-sm-inline'][contains(text(),'Contract')]")).click();
		
		Thread.sleep(2000);
		builder
			.keyDown(Keys.ALT)
			.sendKeys("y")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Show players you can afford now')]")).click();
		
		
		//Beginning of the next season
		Thread.sleep(2000);
		builder
			.keyDown(Keys.ALT)
			.sendKeys("y")
			.keyUp(Keys.ALT)
			.build()
			.perform();
		
		//Thread.sleep(5000);
		//driver.quit();
		
	}

}

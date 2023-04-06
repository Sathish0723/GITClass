package org.testing.hotelBooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new EdgeDriver();
		/*
		 * ChromeOptions ops = new ChromeOptions(); //ops.
		 * setBinary("/Applications/Google Chrome Beta.app/Contents/MacOS/Google Chrome Beta"
		 * ); ops.addArguments("--remote-allow-origins=*"); driver = new
		 * ChromeDriver(ops);
		 */

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

		driver.get("https://omrbranch.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("sathishsatz114@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("Greens@123");

		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Login']")).click();



		WebElement chooseState = driver.findElement(By.name("state"));
		Select s = new Select(chooseState);
		s.selectByValue("Tamilnadu");
		 Navigation n= driver.navigate();
		 n.refresh();
		 WebElement chooseState1 = driver.findElement(By.name("state"));
			Select s1 = new Select(chooseState1);
			s1.selectByValue("Tamil Nadu");
		driver.findElement(By.xpath("//span[text()='Select City *']")).click();

		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		// driver.findElement(By.id("select2-search__field")).click();
		driver.findElement(By.className("select2-search__field")).click();
		driver.findElement(By.xpath("//li[text()='Studio']")).click();
		driver.findElement(By.className("select2-search__field")).click();
		driver.findElement(By.xpath("//li[text()='Deluxe']")).click();
		driver.findElement(By.className("select2-search__field")).click();
		driver.findElement(By.xpath("//li[text()='Luxury']")).click();

		driver.findElement(By.name("check_in")).click();
		driver.findElement(By.xpath("//a[text()='15']")).click();

		driver.findElement(By.name("check_out")).click();
		driver.findElement(By.xpath("//a[text()='18']")).click();

		driver.findElement(By.id("no_rooms")).sendKeys("5");
		driver.findElement(By.id("no_adults")).sendKeys("3");
		driver.findElement(By.id("no_child")).sendKeys("2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("searchBtn")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("hotelsearch_iframe")));
		WebElement continueBtn = driver.findElement(By.xpath("//button[text()='Search']"));

		continueBtn.click();
	
		n.refresh();
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Continue']"));
		findElement.click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("own")).click();
		driver.findElement(By.id("user_title")).sendKeys("Mr.");
		driver.findElement(By.id("first_name")).sendKeys("Sathish");
		driver.findElement(By.id("last_name")).sendKeys("Deva");
		driver.findElement(By.id("user_phone")).sendKeys("9176061600");
		driver.findElement(By.id("user_email")).sendKeys("sathishsatz114@gmail.com");
		driver.findElement(By.id("step1next")).click();
		
		driver.findElement(By.id("high")).click();
		driver.findElement(By.id("other_request")).sendKeys("testing selenium");
		driver.findElement(By.id("step2next")).click();
		
		driver.findElement(By.xpath("//p[text()='Visa, MasterCard, Amex, Discover']")).click();
		driver.findElement(By.id("payment_type")).sendKeys("Debit Card");
		//driver.findElement(By.id("")).;
		driver.findElement(By.id("card_type")).sendKeys("Mastercard");
		driver.findElement(By.id("card_month")).sendKeys("April");
		driver.findElement(By.id("card_no")).sendKeys("5458543212345678");
		driver.findElement(By.id("card_name")).sendKeys("Sathish D");
		driver.findElement(By.id("cvv")).sendKeys("486");
		

	}

}
	
	

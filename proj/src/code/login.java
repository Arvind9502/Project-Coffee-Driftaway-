package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://driftaway.coffee");
		Actions act =new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[11]/div/div")));
		System.out.println(driver.getTitle());
		WebElement alert=driver.findElement(By.xpath("/html/body/div[11]/div/div"));
		System.out.println(alert.getText());
		WebElement close=driver.findElement(By.xpath("/html/body/div[11]/div/button"));
		close.click();		
		//click login
		WebElement login=driver.findElement(By.xpath("/html/body/div[2]/header/div/nav[2]/div/ul/li[3]/a/span"));
		System.out.println(login.getText());
		act.moveToElement(login).click().build().perform();
		Thread.sleep(2000);
		//enter username and password and click on login
		WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		act.moveToElement(username).click().build().perform();
		username.sendKeys("arvindjadhav53@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Ready2wrk");
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		Thread.sleep(500);
		System.out.println("User LoggedIn Successfully");
	}

}

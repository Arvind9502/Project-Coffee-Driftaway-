package code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class View_coffes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://driftaway.coffee");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//skip alert
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[11]/div/div")));
		System.out.println(driver.getTitle());
		WebElement alert=driver.findElement(By.xpath("/html/body/div[11]/div/div"));
		System.out.println(alert.getText());
		WebElement close=driver.findElement(By.xpath("/html/body/div[11]/div/button"));
		close.click();
		js.executeScript("window.scrollBy(0,1200)");
		
		//access view coffess
		WebElement view=driver.findElement(By.linkText("VIEW COFFEES"));
		view.click();
		Thread.sleep(500);
		WebElement All=driver.findElement(By.xpath("//button[contains(text(),'SINGLE ORIGIN')]"));
		All.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		WebElement cold_brew=driver.findElement(By.xpath("//button[contains(text(),'COLD BREW')]"));
		cold_brew.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		WebElement decaf=driver.findElement(By.xpath("//button[contains(text(),'DECAF')]"));
		decaf.click();
		System.out.println(decaf.getText());
		js.executeScript("window.scrollBy(0,1000)");
		
	}
}

package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class logout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Actions act=new Actions(driver);
		WebElement account=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[3]/a"));
		act.moveToElement(account).build().perform();
		WebElement logout=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[3]/ul/li/a/span"));
		act.moveToElement(logout).click().build().perform();
	}

}

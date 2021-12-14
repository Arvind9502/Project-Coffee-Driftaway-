package code;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class change_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebElement change_password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[5]/a"));
		change_password.click();
		WebElement current_password=driver.findElement(By.xpath("//*[@id=\"password_current\"]"));
		current_password.sendKeys("");
		WebElement new_password=driver.findElement(By.xpath("//*[@id=\"password_1\"]"));
		current_password.sendKeys("");
		WebElement confirm_password=driver.findElement(By.xpath("//*[@id=\"password_2\"]"));
		confirm_password.sendKeys("");
		WebElement save=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/form/p[7]/button"));
		save.click();
	}

}

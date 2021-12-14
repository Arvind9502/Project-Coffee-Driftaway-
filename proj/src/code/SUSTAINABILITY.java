package code;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SUSTAINABILITY {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://driftaway.coffee");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[11]/div/div")));
		System.out.println(driver.getTitle());
		WebElement alert=driver.findElement(By.xpath("/html/body/div[11]/div/div"));
		System.out.println(alert.getText());
		WebElement close=driver.findElement(By.xpath("/html/body/div[11]/div/button"));
		close.click();	

	//Get list of options under sustainability
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    List<WebElement> list =driver.findElements(By.xpath("//ul[@id='menu-footer-new-sustainability']/li"));
		System.out.println("There are"+list.size()+ "options under SUSTAINABILITY");

	    for (WebElement element: list) {
	        System.out.println(element.getText());  
	    	}
	
	
	//*************coffee Stories*****************
	    WebElement stories=driver.findElement(By.xpath("//li[@id='menu-item-1266938']"));
	    act.moveToElement(stories).click().perform();
	    System.out.println(driver.getTitle());
	   // JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
	//****************Eco-friendly packaging***************
	    WebElement eco=driver.findElement(By.linkText("Eco-friendly packaging"));
	    eco.click();
	    System.out.println(driver.getTitle());
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	
	//***************Bean for Bean**************
	    WebElement bean=driver.findElement(By.linkText("Bean for Bean"));
	    bean.click();
	    System.out.println(driver.getTitle());
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	//*************Farmer Feedback*******************
	    WebElement farmer=driver.findElement(By.linkText("Farmer Feedback"));
	    farmer.click();
	    System.out.println(driver.getTitle());
	    js.executeScript("window.scrollBy(0,1800)");
	    WebElement fb=driver.findElement(By.xpath("//a[contains(text(),'EYG | Ethiopia Yirgacheffe Gedeb (EN)')]"));
	    fb.click();
	    TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Users\\admin\\Desktop\\selenium\\feedback.png"));
		driver.navigate().back();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	 //**************************Carbon neutral operations******************
		WebElement carbon=driver.findElement(By.linkText("Carbon neutral operations"));
		carbon.click();
		System.out.println(driver.getTitle());
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	//**************************Price Transparency************************
		WebElement price=driver.findElement(By.linkText("Price Transparency"));
		price.click();
		System.out.println(driver.getTitle());
		
	
	//close
		driver.close();
		
	}

}

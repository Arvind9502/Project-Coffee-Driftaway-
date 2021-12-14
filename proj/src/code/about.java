package code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class about {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://driftaway.coffee");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act =new Actions(driver);
			
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[11]/div/div")));
		System.out.println(driver.getTitle());
		WebElement alert=driver.findElement(By.xpath("/html/body/div[11]/div/div"));
		System.out.println(alert.getText());
		WebElement close=driver.findElement(By.xpath("/html/body/div[11]/div/button"));
		close.click();		
		
		//*************Get Options Under ABOUT and Check one of them**************
		WebElement about=driver.findElement(By.xpath("//ul[@id='menu-footer-new-about']"));
		js.executeScript("arguments[0].scrollIntoView();",about);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@id='menu-footer-new-about']/li"));
		System.out.println("There are"+list.size()+"options under ABOUT");

	    for (WebElement element: list) {
	        System.out.println(element.getText());       
	    }
	   
	    //click each one start with **************ABOUT US***************
	    WebElement about_us=driver.findElement(By.xpath("//a[contains(text(),'About us')]"));
	    about_us.click();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    //****************access OUR STORY*****************
	    
	    WebElement our_story=driver.findElement(By.xpath("//a[contains(text(),'Our Story')]"));
	    our_story.click();
	    System.out.println(driver.getTitle());
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	    
	    //access Refer a friend
	    WebElement refer=driver.findElement(By.xpath("//a[contains(text(),'Refer-a-friend')]"));
	    refer.click();
	    System.out.println(driver.getTitle());
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    //access COFFEE CADEMY
	    WebElement academy=driver.findElement(By.linkText("Coffeecademy"));
	    academy.click();
		System.out.println(driver.getTitle());
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//access reviews 
		WebElement reviews=driver.findElement(By.linkText("Reviews"));
		reviews.click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//access press kit
		WebElement presskit=driver.findElement(By.linkText("Press Kit"));
		presskit.click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//*************Cookie Policy***********
		WebElement policy=driver.findElement(By.linkText("Cookie Policy"));
		policy.click();
		System.out.println(driver.getTitle());
		
				
		
		driver.close();
	}

}

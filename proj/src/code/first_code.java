package code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class first_code {

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
		//click login
		WebElement login=driver.findElement(By.xpath("/html/body/div[2]/header/div/nav[2]/div/ul/li[3]/a/span"));
		System.out.println(login.getText());
		act.moveToElement(login).click().build().perform();
		Thread.sleep(2000);
		//enter username and password and click on login
		WebElement username=driver.findElement(By.id("username"));
		act.moveToElement(username).click().build().perform();
		username.sendKeys("arvindjadhav53@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Ready2wrk");
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		Thread.sleep(500);
		System.out.println("User LoggedIn Successfully");
		//check 5 options under dashboard first one coffee history
		WebElement coffeehistory=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[1]/a"));
		System.out.println(coffeehistory.getText());
		coffeehistory.click();
		Thread.sleep(5000);
		WebElement gotit=driver.findElement(By.xpath("/html/body/div[12]/md-dialog/div/md-dialog-content/button"));
		gotit.click();
		//get back to dashboard
		driver.navigate().back();
		
		//shipping address 
		WebElement address=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[2]/a"));
		System.out.println(address.getText());
		address.click();
		
		//*************  add shipping address **************
		WebElement add=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[3]/div[2]/a"));
		add.click();
		Thread.sleep(1200);
		//add first name
		WebElement first_name=driver.findElement(By.id("shipping_first_name"));
		first_name.clear();
		first_name.sendKeys("sandy");
		//add last name
		WebElement last_name=driver.findElement(By.id("shipping_last_name"));
		last_name.clear();
		last_name.sendKeys("Jhon");
		
		WebElement address_line1=driver.findElement(By.id("shipping_address_1"));
		address_line1.clear();
		address_line1.sendKeys("House no:9,street no 3");
		
		WebElement city=driver.findElement(By.id("shipping_city"));
		city.clear();
		city.sendKeys("Pekin");
		
		WebElement zip_code=driver.findElement(By.id("shipping_postcode"));
		zip_code.clear();
		zip_code.sendKeys("47165");
		
		WebElement state=driver.findElement(By.xpath("//*[@id=\"select2-shipping_state-container\"]"));
		state.click();
		WebElement cname=driver.findElement(By.xpath("/html/body/span[2]/span/span[1]/input"));
		cname.clear();
		cname.sendKeys("indi"+Keys.ENTER);
		
		WebElement update=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/form/div[2]/button"));
		update.click();
		
		System.out.println("shipping address added successfully");
		
		//************* add billing address *************
		
		WebElement billing=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[3]/div[1]/a"));
		System.out.println(billing.getText());
		billing.click();
		
		// Fill details
		WebElement first_name1=driver.findElement(By.id("billing_first_name"));
		first_name1.clear();
		first_name1.sendKeys("Arvind");
		WebElement last_name1=driver.findElement(By.id("billing_last_name"));
		last_name1.clear();
		last_name1.sendKeys("Jadhav");
		WebElement Billing_address=driver.findElement(By.id("billing_address_1"));
		Billing_address.clear();
		Billing_address.sendKeys("H.NO.11");
		WebElement Billing_city=driver.findElement(By.id("billing_city"));
		Billing_city.clear();
		Billing_city.sendKeys("Pune");
		WebElement Country=driver.findElement(By.id("select2-billing_country-container"));
		Country.click();
		WebElement country_name=driver.findElement(By.className("select2-search__field"));
		country_name.sendKeys("indi"+Keys.ENTER);
		WebElement Billing_state=driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]"));
		Billing_state.click();
		WebElement state_name=driver.findElement(By.xpath("/html/body/span[2]/span/span[1]/input"));
		state_name.clear();
		state_name.sendKeys("mahar"+Keys.ENTER);
		WebElement billing_pincode=driver.findElement(By.id("billing_postcode"));
		billing_pincode.clear();
		billing_pincode.sendKeys("411011");
		WebElement Billing_phoneno=driver.findElement(By.id("billing_phone"));
		Billing_phoneno.clear();
		Billing_phoneno.sendKeys("8800112266");
		WebElement Update_address=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/form/div[2]/button"));
		Update_address.click();		
		System.out.println("Billing address added successfully");
		
//		//goto dash board
		WebElement dashboard=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[1]/a"));
		dashboard.click();
		
		//subscriptions
		WebElement subscription=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[2]/a"));
		subscription.click();
		System.out.println("subscription");
		//driver.navigate().back();
	//Orders
		
		WebElement orders=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[8]/main/article/div/div/nav/ul/li[3]/a"));
		orders.click();
		System.out.println("orders");
		//driver.navigate().back();
		
		//cold brew profile
		
		WebElement cold_brew=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[5]/a"));
		cold_brew.click();
		System.out.println("Cold Brew Profile");
		//driver.navigate().back();
		
		//My Points
		
		WebElement mypoint=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[6]/a"));
		mypoint.click();
		System.out.println("My points");
		//driver.navigate().back();
		
		//Saved Cards
		WebElement card=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[7]/a"));
		card.click();
		
		// User details
		WebElement userdetails=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[8]/a"));
		userdetails.click();
		System.out.println("Checked User Details");
		
		//Refer Friends
		
		WebElement refer=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/nav/ul/li[9]/a"));
		refer.click();
		System.out.println("Checked Refer Friends");
		
		//Logout
		WebElement logout=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[3]/a/span"));
		act.moveToElement(logout).perform();
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[3]/ul/li/a"));
		act.moveToElement(button).click().perform();
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[1]/div/div/div/div[1]")));
		js.executeScript("window.scrollBy(0,1000)");
		WebElement confirm=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/nav/ul/li[10]/a"));
		System.out.println(confirm.getText());
		//WebElement log_out=driver.findElement(By.linkText("Confirm and log out"));
		confirm.click();
		driver.close();
	}

}

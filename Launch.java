package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver; (ctrl + shift + O)

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch empty chrome browser
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("tejalds05@gmail.com") ;
		driver.findElement(By.id("pass")).sendKeys("Facebook@1234") ;
		driver.findElement(By.name("login")) ;

	}

}

package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
//		driver.findElement(By.linkText("Edit")).click() ;
//		driver.findElement(By.id("fullName")).sendKeys("Tejal Dipak Survase");
		driver.findElement(By.cssSelector("a[class='button is-primary is-rounded is-small']")).click();
		driver.findElement(By.id("name")).sendKeys("Tejal Dipak Survase") ;
		driver.findElement(By.id("email")).sendKeys("tejalds05@gmail.com") ;
		driver.findElement(By.id("pass")).sendKeys("Tejal@1234") ;
		driver.findElement(By.id("agree")).click() ;
		driver.findElement(By.cssSelector("button[class='button is-primary']")).click();
		
	}

}

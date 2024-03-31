package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.flipcart.com/") ;
//		driver.findElement(By.xpath("//span[text()='Grocery']")).click() ;
        driver.get("htpps://shop-global.malaicha.com/login");
        driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

}

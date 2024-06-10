import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.MyFunctions;

public class _07_FindElementByName {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://accounts.lambdatest.com/login");

        WebElement byName = driver.findElement(By.name("email"));

        byName.sendKeys("deneme@gmail.com");

        MyFunctions.Bekle(3);

        driver.quit();








    }
}

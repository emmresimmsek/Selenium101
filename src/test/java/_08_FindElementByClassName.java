import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.MyFunctions;

public class _08_FindElementByClassName {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize(); // fullscreen yerine maximize kullanmayı tercih ediyorum.

        driver.get("https://www.w3schools.com/jsref/met_document_getelementsbyclassname.asp");


        WebElement ngc = driver.findElement(By.className("w3-btn"));

        ngc.click();

        MyFunctions.Bekle(3);

        driver.quit();


    }
}

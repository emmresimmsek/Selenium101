import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.MyFunctions;

public class _02_FullScreen {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://ngc.com.tr");
        
        MyFunctions.Bekle(5);

        driver.quit();









    }
}

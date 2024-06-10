import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _06_ByLinkText {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        //HTML yapısında <a> etiketi içerisinde belirtilmiş bir metinle eşleşen bağlantıları bulmak için kullanılır.
        // <a href="https://example.com/login">Giriş</a>  Bağlantı etiketi örneği...


        driver.get("https://www.w3schools.com");

        WebElement learn = driver.findElement(By.linkText("Learn HTML"));

        learn.click(); // Tıklıyoruz.

        driver.quit();  // Driver'ı kapatıyoruz.
















    }
}

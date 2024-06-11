import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.MyFunctions;

public class _10_FirstExample {
    public static void main(String[] args) {


        // ---SENARYO---
        //  https://demo.seleniumeasy.com/basic-first-form-demo.html adresine git.
        //  Açılan sayfada "Enter message" alanına mesajını gir.
        //  "Show Message" butonuna tıkla
        //  Butona tıkladıktan sonra mesajın görünürlüğünü kontrol et.


        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        driver.manage().window().maximize();

        WebElement message = driver.findElement(By.cssSelector("[placeholder='Please enter your Message']"));

        message.sendKeys(" Selenium Öğreniyorum");

        WebElement tikla = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        MyFunctions.Bekle(3);
        tikla.click();


        WebElement result = driver.findElement(By.cssSelector("#display"));
        System.out.println(result.getText());  // Sonucun metnini yazdır

        MyFunctions.Bekle(3);
        driver.quit();






    }
}

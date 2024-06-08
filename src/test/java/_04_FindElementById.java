import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.MyFunctions;

public class _04_FindElementById {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jotform.com/tr/signup/");

        WebElement isim = driver.findElement(By.id("fullname"));
        isim.sendKeys("emre");

        WebElement mail = driver.findElement(By.id("suEmail"));
        mail.sendKeys("deneme@gmail.com");

        WebElement password = driver.findElement(By.id("suPassword"));
        password.sendKeys("123456789");

        WebElement button = driver.findElement(By.id("signupButton"));
        button.click();

        MyFunctions.Bekle(5);

        driver.quit();

        // id niteliği, bir HTML elementine CSS veya JavaScript kodunda kolayca erişim sağlamak için çok yaygın bir şekilde kullanılır.
        // Ancak, her elementin bir id niteliği olması gerekmez; gerektiğinde kullanılabilir.


        // Aynı id değeri iki elemente verilemez. Sadece tek bir elementte kullanılabilir.
        // CSS'de id leri # (diyez) ile çağırırız.










    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.MyFunctions;

public class _09_BrowserNavigation {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver(); //  "Google Chrome" tarayıcıda sorun var. O yüzden "Firefox" kullanıyorum.



        //The first thing you will want to do after launching a browser is to open your website.
        //Bir tarayıcıyı başlattıktan sonra yapmak isteyeceğiniz ilk şey web sitenizi açmak olacaktır.

        driver.get("https://selenium.dev"); // Convenient (Uygun)

        // driver.navigate().to("https://selenium.dev"); //  //Longer way (Uzun Yol)

        driver.manage().window().maximize(); // Tarayıcının ekranı kaplamasını sağlıyoruz.


        WebElement download = driver.findElement(By.cssSelector("[href='/downloads'] > span"));
        download.click();
        MyFunctions.Bekle(2);

        driver.navigate().back();
        MyFunctions.Bekle(2);

        driver.navigate().forward();
        MyFunctions.Bekle(2);

        driver.navigate().refresh();
        MyFunctions.Bekle(2);




        driver.quit();















    }
}

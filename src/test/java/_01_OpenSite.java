import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpenSite {
    public static void main(String[] args) {

        /* Every automation Java work file starts with creating a reference of the web browser that
        we wish to use, as mentioned in the below syntax. */
        WebDriver driver = new ChromeDriver(); // WebDriver nesnesi oluşturulur.

        // Belirli bir URL'ye gidilir
        driver.get("https://www.selenium.dev");

        // Tarayıcı kapatılır
        driver.quit();






    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.MyFunctions;

public class _01_OpeningSite {
    public static void main(String[] args) {

        /* Every automation Java work file starts with creating a reference of the web browser that
        we wish to use, as mentioned in the below syntax. */
        WebDriver driver = new ChromeDriver(); // WebDriver nesnesi oluşturulur. Chrome Tarayıcı seçtik.

        // Belirli bir URL'ye gidilir
        driver.get("https://www.selenium.dev");

        MyFunctions.Bekle(5); // 5 saniye bekler.

        // Tarayıcı kapatılır
        driver.quit(); // driver.close() da kullanılabilir ama  farkları var!








    }
}

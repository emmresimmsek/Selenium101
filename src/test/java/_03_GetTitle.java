import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetTitle {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen(); // Tarayıcı penceresini tam ekran moduna getirmek için kullanılır.

        driver.get("https://ngc.com.tr"); // Belirtilen URL'ye git
        String title = driver.getTitle();  // Sayfanın başlığını al

        System.out.println(title); // Sayfanın başlığını yazdır.

        driver.quit(); // WebDriver'ı kapat


    }
}

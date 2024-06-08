import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_NoSuchElementException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Exception, program çalıştığı esnada ortaya çıkan, beklenmeyen ve öngörülemeyen hatalara verilen isimdir.
        // Exception’ları "Error" dediğimiz diğer hatalardan ayıran en büyük özellikleri, "handle" edilebilmeleridir.
        // Yani bu tür hatalar, programcılar tarafından belirli kodlarla idare edilebilir ve kontrol altına alınabilirler.
        // Bu da programın belirlenen senaryolarla çalışmasına devam ettirmesini mümkün kılar.

        driver.get("https://www.jotform.com/tr/signup/");

       // WebElement isim = driver.findElement(By.id("idyanlisyaziyorum"));  // NoSuchElementException
        // Belirttiğim id'i bulamadığı için "NoSuchElementException" hatası fırlatıldı.



        //  try-catch blokları kullanarak belirli bir elementin bulunamaması durumunda yapılacak işlemi belirleyebilirsiniz:

        try {
            WebElement isim = driver.findElement(By.id("idyanlisyaziyorum"));
            isim.sendKeys("emre");
        } catch (Exception e) {

            System.out.println("Web Element  By.id Hatası ");
        }

        // try bloğunda belirli bir elementi bulmaya çalışıyorsunuz ve eğer belirtilen element bulunamazsa,
        // catch bloğu çalışarak "Web Element By.id Hatası" mesajını yazdırıyor.


        driver.quit();

        // NoSuchElementException,
        // Java'da özellikle Selenium gibi otomasyon test araçlarında sıkça karşılaşılan bir istisnai durumdur.
        // Bu istisna, bir WebDriver nesnesi ile belirli bir HTML elementini bulmaya çalışırken ilgili elementin bulunamaması
        // durumunda fırlatılır.

















    }
}

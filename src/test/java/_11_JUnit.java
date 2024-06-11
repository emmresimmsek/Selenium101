import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;


public class _11_JUnit {


        // JUnit, Java programlama dili için bir test otomasyon çerçevesidir.
        // JUnit genellikle birim testi için kullanılır.
        // Unit testler, genellikle yazılan kodun küçük parçalarını (metodlar, sınıflar) test etmek için kullanılır
        // ve kodun doğruluğunu sağlamak için önemlidir.

        // Junit'i projemize dahil edelim: https://mvnrepository.com/artifact/junit/junit/4.13.2

        //@Test anotasyonunu kullanırken, bu anotasyonun bir metot tanımlayıcı olan public void metodun hemen üzerinde
        // kullanılması gerekir. Ayrıca, test metotlarının statik olmaması gerektiğini de unutmayın.


        @Test
        public void test(){

            //Toplama işlemi
            int a = 5;
            int b = 2;

            //Beklenen Sonuç
        int expected = 7;

        // Toplama işlemi
        int toplam = a + b;

            // Beklenen sonuçla gerçek sonucu karşılaştır









        }





















}

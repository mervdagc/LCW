import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainFunctions {
    public static WebDriver driver;
    public static WebElement element;

    //Browser'ın açılması için metot. Parametre olarak gideceği webUrl alır.
    public void OpenPage(String webUrl) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--disable-notifications");
        driver=new ChromeDriver(options);
        driver.get(webUrl);
        System.out.println("Sayfa başarılı şekilde açıldı");
    }
    public void Category(){
        MainFunctions a = new MainFunctions();
        //Kadın kategorisine tıklandı
        ClickButtonXPath("/html/body/div[3]/div/div[1]/header/div[3]/nav/ul/li[1]/a");
        System.out.println("Sayfa açılıp kategori seçme adımı tamamlandı");
    }
    public void SubCategory(){
        MainFunctions a = new MainFunctions();
        //Açılan sayfadan Dış giyim seçildi
        ClickButtonXPath("/html/body/div[4]/div/div[3]/div[1]/div/div[2]/div[1]/a/img");
        System.out.println("Alt kategori seçme adımı tamamlandı");
    }
    public void ProductDetail(){
        //ürünün detayına gidildi
        ClickButtonXPath("/html/body/div[3]/div/div[2]/div[2]/div[5]/div/div[2]/div[1]/a/div[1]/img");
        System.out.println("Ürün detay sayfası başarılı şekilde açıldı");
    }
    public void AddToBasket(){
        //Ürün bedeni seçildi
        ClickButtonXPath("/html/body/div[4]/div/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/div[1]/div[3]/a[1]");
        //Ürün sepete eklendi
        ClickButtonID("pd_add_to_cart");
        System.out.println("Ürün Sepete başarılı şekilde eklendi");
    }
    public void GoToBasket(){
        //Sepete gidildi
        ClickButtonXPath("/html/body/div[4]/div/div[1]/header/div[1]/div[3]/div/div[2]/a");
        System.out.println("Sepete başarılı şekilde gidildi");
    }
    public void MainPage(){
        //Anasayfaya dönmek için ana logoya tıklandı
        ClickButtonXPath("/html/body/div[4]/div/div[1]/header/div[1]/div[1]/a");
        System.out.println("Ana sayfaya dönüldü");
    }

    //ID'si bilinen bir element için click işlemi yapan metot.
    public void ClickButtonID(String ButtonID) {
        driver.findElement(By.id(ButtonID)).sendKeys(Keys.ENTER);
    }

    //ID'si bilnmeyip xpath'i bilinen bir element için click işlemi yapan metot.
    public void ClickButtonXPath(String ButtonXPath) {
        driver.findElement(By.xpath(ButtonXPath)).click();
    }

    //Selenium driver'ın kapatılması için yazılmış metot.
    public void driverQuit(){
        driver.quit();
    }
}
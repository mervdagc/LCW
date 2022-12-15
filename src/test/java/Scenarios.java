import org.openqa.selenium.*;
public class Scenarios {
    public static WebDriver driver;
    public static WebElement element;

    public void Scenario(){
        MainFunctions e =new MainFunctions();
        e.OpenPage("https://www.lcwaikiki.com/tr-TR/TR");
        e.Category();
        e.SubCategory();
        e.ProductDetail();
        e.AddToBasket();
        e.GoToBasket();
        e.MainPage();
    }

    public static void main(String[] args) {
        Scenarios s = new Scenarios();
        MainFunctions m = new MainFunctions();
        //Yazılan senaryo metotları main içerisinde çağrılır.
        s.Scenario();
        //m.driverQuit();
    }
}

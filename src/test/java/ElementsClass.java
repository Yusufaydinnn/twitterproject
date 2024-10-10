import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Timer;

public class ElementsClass {

    public WebDriver driver;

    public ElementsClass(WebDriver driver) {
        this.driver = driver;

    }
        public WebElement getgooglearama(){
        return driver.findElement(By.id("APjFqb"));
        }
        public WebElement getbuton(){
        return driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']"));
        }
        public WebElement getkabulEt(){
        return driver.findElement(By.xpath("//button[@data-testid='xMigrationBottomBar']\n"));
        }
        public WebElement twitteragirme(){
        return driver.findElement(By.xpath("//h3[.='X. Olan biten burada / X']"));
        }
        public WebElement getxGirisYap(){
        return driver.findElement(By.xpath("//a[@href='/login']//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3']"));
        }
        public WebElement getkullaniciadi(){
        return driver.findElement(By.xpath("//input[@name='text']"));
        }
        public WebElement getileriButonu(){
        return driver.findElement(By.xpath("//div[.='İleri']"));
        }
        public WebElement getsifre(){
        return driver.findElement(By.xpath("//input[@name='password']"));
        }
        public WebElement getbaslama() {
            WebElement button = driver.findElement(By.xpath("//span[@class='css-1jxf684 r-dnmrzs r-1udh08x r-3s2u2q r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3 r-1inkyih r-rjixqe']/span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3']"));
            Assert.assertTrue("Buton sayfada mevcuttur. ", button.isDisplayed());
            return button;
        }
        public WebElement getgiristekikabulEt(){
        return driver.findElement(By.xpath("//button[@data-testid='xMigrationBottomBar']\n"));
        }
        public WebElement getdurumpaylas(){
        return driver.findElement(By.xpath("//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']"));
        }
        public WebElement getplanla(){
        return driver.findElement(By.cssSelector("[aria-label='Gönderiyi planla'] .r-4qtqp9"));
        }
        public WebElement getay(){
        return driver.findElement(By.id("SELECTOR_11"));
        }
        public WebElement getsaat(){
        return driver.findElement(By.xpath("//div[@class='css-175oi2r r-z2wwpe r-rs99b7 r-kemksi r-vhj8yc r-9cip40']/select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-1nao33i r-1loqt21 r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-is05cd r-ttdzmv']"));
        }
        public WebElement getonayla(){
        return driver.findElement(By.xpath("//button[@class='css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-1cwvpvk r-15ysp7h r-4wgw6l r-3pj75a r-1loqt21 r-o7ynqc r-6416eg r-1ny4l3l']//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3']"));
        }
    }

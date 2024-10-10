import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.spec.KeySpec;
import java.util.Timer;

public class TestCase extends BaseTest{


    @Test
public void test03(){


    ElementsClass ElementClass = new ElementsClass(driver);

    ElementClass.getgooglearama().click();
    ElementClass.getgooglearama().sendKeys("X");
    ElementClass.getbuton().click();
    ElementClass.twitteragirme().click();
    ElementClass.getkabulEt().click();
    ElementClass.getxGirisYap().click();
    ElementClass.getkullaniciadi().click();
    ElementClass.getkullaniciadi().sendKeys("twittername" );
    ElementClass.getileriButonu().click();
    ElementClass.getsifre().click();
    ElementClass.getsifre().sendKeys("");
    ElementClass.getbaslama().click();
    ElementClass.getgiristekikabulEt().click();
    ElementClass.getdurumpaylas().sendKeys("Profesyonel Hizmetler/Test Çözümleri");
    ElementClass.getplanla().click();
    ElementClass.getay().sendKeys("EKİM",Keys.ENTER,Keys.TAB,"10",Keys.ENTER,Keys.TAB,"2024",Keys.ENTER,Keys.TAB);
    ElementClass.getsaat().click();
    ElementClass.getsaat().sendKeys("13",Keys.ENTER,Keys.TAB,"45",Keys.ENTER,Keys.TAB);
    ElementClass.getonayla().click();



}
}

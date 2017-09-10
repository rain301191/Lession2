package Login;

import Myaction.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void Testloginblank() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\NguyenAnh-PC\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Action action = new Action(driver);
        action.open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        action.btnlogin("SubmitLogin");
        String errmgss = action.GetText("//div[@class ='alert alert-danger']/ol/li");
        Assert.assertEquals(errmgss, "An email address required.");
        action.close();
    }

}

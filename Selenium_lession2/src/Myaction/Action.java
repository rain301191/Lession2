package Myaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {
    WebDriver driver = null;
    //Khoi tao class
    public Action(WebDriver driver1){
        this.driver = driver1;
    }
    public void open(String url){
        driver.get(url);

    }
    public void btnlogin(String nut){
        By summit = By.id(nut);
        WebElement Login = driver.findElement(summit);
        Login.click();
    }
    public String GetText(String xpath ){
        By Err = By.xpath(xpath);
        WebElement errmeg = driver.findElement(Err);
        String errmgss = errmeg.getText();
        return errmgss;

    }
    public void close(){
        driver.close();
    }

}

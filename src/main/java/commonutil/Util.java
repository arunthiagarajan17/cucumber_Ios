package commonutil;

import com.demo.pages.HomePage;
import com.demo.pages.LogIn;
import org.junit.Assert;

public class Util {

    LogIn logIn;
    HomePage homePage;

    public Util() {
        logIn = new LogIn();
        homePage = new HomePage();
    }

    public void signIn(String userName, String password) {
        logIn.userName().sendKeys(userName);
        logIn.password().sendKeys(password);
        logIn.signIn().click();
    }

    public void userValidation(String name, String role, String office) {
        Assert.assertEquals("Name is not match", name, homePage.nameLabel().getText());
        Assert.assertEquals("Role is not match", role, homePage.roleLabel().getText());
        Assert.assertEquals("Office is not match", office, homePage.officeLabel().getText());
    }

    public void signOut(){
        homePage.signOut().click();
    }

    public void userErrorLogin(String errorLoginText){
        Assert.assertEquals("Login error is not found", errorLoginText, logIn.loginError().getText());
    }

    public void loginbutton()
    {
        boolean result= logIn.loginpresent();
        Assert.assertEquals("element not present",true,result);
    }
}

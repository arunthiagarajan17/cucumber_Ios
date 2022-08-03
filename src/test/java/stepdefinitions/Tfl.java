package stepdefinitions;

import com.demo.base.Context;
import commonutil.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tfl extends Context {

    Util util;

    public Tfl() {
        util = new Util();
    }


   @Given("a TFL user lands of application")
    public void a_tfl_user_lands_of_application() {
       log.info("User has landed on TFL application");
       throw new io.cucumber.java.PendingException();
   }


    @When("user enters {string} and {string} to signIn")
    public void user_enters_and_to_sign_in(String userName, String password) {
        util.signIn(userName,password);
        throw new io.cucumber.java.PendingException();
    }
    @Then("user validates {string} {string} and {string} in homepage")
    public void user_validates_and_in_homepage(String name, String role, String office) {
        util.userValidation(name,role,office);
        throw new io.cucumber.java.PendingException();
    }
    @Then("user signOut the application")
    public void user_sign_out_the_application() {
        util.signOut();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user navigate to login screen")
    public void userNavigateToLoginScreen() {
        util.loginbutton();

    }


    @When("user enters invalid {string} and {string} to signIn")
    public void userEntersInvalidAndToSignIn(String userName, String password) {
        util.signIn(userName,password);
    }

    @Then("user validates the {string} text in the popup")
    public void userValidatesTheTextInThePopup(String errorText) {
        util.userErrorLogin(errorText);
    }
}

package Cucumber.StepDefs;

import io.cucumber.java.en.*;

public class stepDefs {
    @Given("We open the browser")
    public void a(){
        System.out.println("We open the browser");
    }

    @When("we type our credentials")
    public void b(){
        System.out.println("we type our credentials");
    }

    @And("the credentials are correct")
    public void c(){
        System.out.println("the credentials are correct");
    }

    @Then("the user must be able to login")
    public void d(){
        System.out.println("the user must be able to login");
    }

    @But("the credentials are incorrect")
    public void e(){
        System.out.println("the credentials are incorrect");
    }

    @Then("the user must not be able to login")
    public void f(){
        System.out.println("the user must not be able to login");
    }

    @And("we type the username as {string}")
    public void userName(String name){
        System.out.println("Name is:  "+name);
    }

    @And("we type the password as {string}")
    public void password(String pwd){
        System.out.println("Password is:  "+pwd);
    }

    @Then("the user has got {int} marks for 600")
    public void marks(int i){
        System.out.println("Marks are: "+i+" for 600");
    }
}

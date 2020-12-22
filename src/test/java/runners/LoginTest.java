package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import utilities.Driver;


@CucumberOptions(

        features = {"src/test/java/features/Login.feature"},
        glue = {"stepdefs"},
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:" +
                        "target/ExtentReport/LoginTest.html"
        }
)
public class LoginTest extends AbstractTestNGCucumberTests {

        @AfterTest
        public void tearDown(){
                Driver.quitDriver();
        }
}
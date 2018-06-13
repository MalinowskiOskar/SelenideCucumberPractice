package cucumber;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.close;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "java\\features",
        glue = "steps",
        plugin = {"pretty", "json:target/cucumber/cucumber.json",
                "html:target/cucumber/site/cucumber-pretty","junit:target/cucumber/cucumber.xml"}
)
public class TestRunner  {
    @BeforeClass
    public static void InitializeTest() {
        System.out.println("\nStart Test!\n");
        Configuration.startMaximized = true;
        Configuration.browser = "firefox";
        System.setProperty("webdriver.gecko.driver","C:\\important\\geckodriver\\geckodriver.exe");
    }

    @AfterClass

    public static void TearDownTest() {
        System.out.println("\nEnd of tests!\n");
        close();
    }
}
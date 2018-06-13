package cucumber;

import com.codeborne.selenide.Configuration;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.close;

public class Setup {
    @Before
    public void InitializeTest() {
        System.out.println("\nStart Test!\n");
        Configuration.startMaximized = true;
        Configuration.browser = "firefox";
        System.setProperty("webdriver.gecko.driver","C:\\important\\geckodriver\\geckodriver.exe");
    }

    @After

    public void TearDownTest(Scenario scenario) {

        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        System.out.println("\nEnd of tests!\n");
        close();
    }
}

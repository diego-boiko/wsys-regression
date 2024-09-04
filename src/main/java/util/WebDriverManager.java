package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;
    private static String url = "http://wsysapptest:5201/auth/login";

    private WebDriverManager() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {

            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();

        }

        return driver;

    }

    public static void closeDriver() {

        if (driver != null) {

            driver.quit();
            driver = null;

        }
    }

}

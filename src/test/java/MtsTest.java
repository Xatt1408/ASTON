import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {
    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cookie__buttons']/button[@id='cookie-agree']")));
        button.click();
    }

    @Test
    @DisplayName("Соответствие названия блока'Онлайн пополнение без комиссии'")
    public void nameTest() {
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText().replaceAll("\\n", " ");
        assertEquals(expectedText, actualText, "Указанное название должно соответствовать текущему названию блока.");
    }

    @Test
    @DisplayName("Наличие логотипов платёжных систем в блоке 'Онлайн пополнение без комиссии'")
    public void imgTest() {
        List<WebElement> images = driver.findElements(By.xpath("//div[@class='pay__partners']/descendant::img"));

        int expectedNumberOfLogos = 5;
        assertEquals(expectedNumberOfLogos, images.size(), "Количество логотипов платёжных систем должно быть равно " + expectedNumberOfLogos);

        for (WebElement image : images) {
            String url = image.getAttribute("src");
            assertTrue(url != null && !url.isEmpty(), "URL картинки не должен быть пустым");
            double height = image.getSize().height;
            double width = image.getSize().width;
            assertTrue(height > 0, "Высота картинки " + url + " должна быть больше 0");
            assertTrue(width > 0, "Ширина картинки " + url + " должна быть больше 0");
        }
    }

    @Test
    @DisplayName("Работа ссылки «Подробнее о сервисе»")
    public void linkTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Подробнее о сервисе")));
        String expectedUrl = link.getAttribute("href");
        link.click();

        wait.until(ExpectedConditions.urlContains(expectedUrl));
        String actualUrl = driver.getCurrentUrl();
        assertTrue(actualUrl.contains(expectedUrl), "Ссылки переводит на другую страницу");

        driver.navigate().back();
    }

    @Test
    @DisplayName("Работа кнопки «Продолжить» ")
    public void submitTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement buttonSubmit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='pay-connection']")));
        WebElement inputPhone = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        inputPhone.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        inputSum.sendKeys("200");
        buttonSubmit.click();
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

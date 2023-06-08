package org.insiderTask.base;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage{
    WebDriver driver = null;
    WebDriverWait wait = null;
    final static Logger logger = Logger.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
        try {
            logger.info(findElement(by).getText() + " Nesnesine tıklandı.");
        } catch (Exception e) {
            logger.error(findElement(by).getText() + " nesnesine tıklanılamadı: " + e);
        }
    }

    public void _click(By by){
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findElement(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", findElement(by));
    }

    public void select(By by, String filter) {
        if(findElement(by).isDisplayed()) {
            List<WebElement> options = driver.findElements(By.tagName("li"));
            for (WebElement option : options)
            {
                if (option.getText().equals(filter))
                {
                    logger.info("You searching: " + filter);
                    option.click();
                    try {
                        logger.info("You find it and clicked");
                    } catch (Exception e) {
                        logger.error("Your option is not here: " + e);
                    }
                    break;
                }
            }
        }
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
        logger.info(findElement(by).getText() + " Nesnesine üzerine gelindi.");
    }

    public Point getLocation(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getLocation();
    }

    public void getUrl(String text) {
        String currentUrl = driver.getCurrentUrl();
        logger.info("You are working on this URL: " + currentUrl);
        if (!currentUrl.equals(text)) {
            logger.error("Home page is not correct.");
            throw new IllegalStateException("Home page is not correct.");
        }
        else {
            logger.info("Home page is correct!");
        }
    }

    public void subUrl(String text) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(text));
        logger.info("You are on at " + currentUrl);
        try {
            logger.info("You are on the correct web page..");
        } catch (Exception e) {
            logger.error("You are on the wrong web page.");
        }
    }

    public void isDisplayedItem(By by) {
        Assert.assertTrue(findElement(by).isDisplayed());
        try {
            logger.info("The area you are looking for is available on the web page");
        } catch (Exception e) {
            logger.error("The area you are looking for is not available on the web page.");
        }
    }

    public void getRedirectUrl(String text) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(text));
        logger.info("You have been redirected to " + currentUrl);
        try {
            logger.info("You have been redirected to the correct web page.");
        } catch (Exception e) {
            logger.error("You have been redirected to the wrong web page.");
        }
    }

    public void scrollDown(Point point) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy"+ point +"");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,0)");
    }

    public void switchWindow() {
        Set<String> handles = driver.getWindowHandles();
        Iterator it = handles.iterator();
        String homePage = (String) it.next();
        String childPage = (String) it.next();
        driver.switchTo().window(childPage);
    }

    public void screenShot(By by) {
        int max = 100000000;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        File screenshot = findElement(by).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("C:\\projectScreenshots\\" + rand +".png"));
            logger.info("The screenshot was taken to the path C:\\projectScreenshots\\.");
        } catch (IOException e) {
            logger.error("An error was encountered while taking a screenshot " + e.getMessage());
        }
    }

    public void positionContainsCheck(By by, String actual) {
        List<WebElement> elements = driver.findElements(by);

        for(WebElement element : elements) {
            String text = element.getText();
            Assert.assertTrue(text.contains(actual));
        }
        try {
            logger.info("All jobs position contains 'Quality Assurance'!");
        } catch (Exception e) {
            logger.error("All jobs position not contains 'Quality Assurance'! " + e.getMessage());
        }
    }

    public void departmentContainsCheck(By by, String actual) {
        List<WebElement> elements = driver.findElements(by);

        for (WebElement element : elements) {
            String text = element.getText();
            Assert.assertEquals(text, actual);
        }
        try {
            logger.info("All department position contains 'Quality Assurance'!");
        } catch (Exception e) {
            logger.error("All department position not contains 'Quality Assurance'!\"");
        }
    }

    public void locationContainsCheck(By by, String actual) {
        List<WebElement> elements = driver.findElements(by);

        for (WebElement element : elements) {
            String text = element.getText();
            Assert.assertTrue(text.contains(actual));
        }
        try {
            logger.info("All jobs is in 'Istanbul Turkey'!");
        } catch (Exception e) {
            logger.error("All jobs is not in 'Istanbul Turkey'!");
        }
    }

    public void applyButtonCheck(By by, String actual) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,400)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hoverElement(by);
        String text = findElement(by).getText();
        Assert.assertEquals(text, actual);
        try {
            logger.info("Button is include: '" + actual +"'");
        } catch (Exception e) {
            logger.info("Button is not include: '" + actual + "'");
        }
        js.executeScript("window.scrollTo(0,0)");
    }
}

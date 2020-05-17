import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.List;

public class FirstTest {

    private AppiumDriver driver;

    @Before

    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "/Users/nastia/JavaAppiumAutomation/apks/org.wikipedia.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

/*    @Test

    public void firstTest() {

        waitForElementAndClick(
                "//*[contains(@text,'Search Wikipedia')]",
                "Cannot find Search Wikipedia input",
                5
        );

        waitForElementAndSendKeys(
                "//*[contains(@text,'Search…')]",
                "JAVA",
                "Cannot find search input",
                5
        );

        //  element_to_enter_search_line = driver.findElementByXPath("//*[contains(@text,'Search…')]");
//    element_to_enter_search_line.sendKeys("Java");

        waitForElementPresent(
                "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Java']",
                " Cannot find 'Java' topic searching by Java ",
                15);

        waitForListElementById(
                "org.wikipedia:id/page_list_item_container",
                "It's not enough elements",
                5);


        waitForElementByIdAndClick("org.wikipedia:id/search_close_btn",
                "Cannot find search Close button",
                5);


        waitForElementNotPresentById ("org.wikipedia:id/page_list_item_container",
                "Can find search result",
                5);
    } */

 /*   @Test

    public void testCompareArticleTitle(){


        waitForElementAndClick(
                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                "Cannot find Search Wikipedia input",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@text,'Search…')]"),
                "JAVA",
                "Cannot find search input",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='JavaScript']"),
                "Cannot find Search Wikipedia input",
                5
        );

        WebElement title_element = waitForElementAndSendKeys(By.id("org.wikipedia:id/view_page_title_text"),
                "test",
                "сообщение",15);

        String article_title = title_element.getAttribute("text");

        Assert.assertEquals("Мы видим неожиданный заголовок","JavaScriptщщ", article_title);

    }

    @Test

    public void testSwipeArticle(){


        waitForElementAndClick(By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                "Cannot find Search Wikipedia input",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@text,'Search…')]"),
                "Appium",
                "Cannot find search input",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_title'][@text='Appium']"),
                "Cannot find Search Appium input",
                5
        );




swipeUpFindelement(
        By.xpath("//*[@text='View page in browser']"),
        "Сообщение об  ошибке",20);


    }
    @Test
    public void saveFirstArticleToMyList()
    {

        waitForElementAndClick(
                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                "Cannot find Search Wikipedia input",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@text,'Search…')]"),
                "JAVA",
                "Cannot find search input",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='JavaScript']"),
                "Cannot find Search Wikipedia input",
                5
        );

         waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"),
                "не найден заголовок статьи",
                 25);

         waitForElementAndClick(By.xpath("//android.widget.ImageView[@content-desc='More options']"),
                 "не найдена кнопка More options",
                 5);

        waitForElementAndClick(By.xpath("//android.widget.TextView[@text='Add to reading list']"),
                "не найдена кнопка Add to reading list",
                5);
        waitForElementAndClick (By.id("org.wikipedia:id/onboarding_button"),
                "не найдена кнопка GOT IT ",
                5);

        waidForElementAndClear(By.id("org.wikipedia:id/text_input"),
                "не получилось очистить поле My reading list",
                5);


        String name_of_folder="Learning programming";                     //создание папки

     waitForElementAndSendKeys(By.id("org.wikipedia:id/text_input"),
             name_of_folder,
             "не удалось ввести название списка ",
             5);
     waitForElementAndClick(By.xpath("//*[@text='OK']"),
             "Не удалось нажать на кнопку ОК",
             5);

     waitForElementAndClick(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),
             "Не удалось нажать Х",
             5);




        waitForElementAndClick(                                     //добавление 2 статьи
                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                "Cannot find Search Wikipedia input",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@text,'Search…')]"),
                "JAVA",
                "Cannot find search input",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Java (programming language)']"),
                "Cannot find Search Wikipedia input",
                5
        );
        waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"),
                "не найден заголовок статьи",
                15);

        waitForElementAndClick(By.xpath("//android.widget.ImageView[@content-desc='More options']"),
                "не найдена кнопка More options",
                5);

        waitForElementAndClick(By.xpath("//android.widget.TextView[@text='Add to reading list']"),
                "не найдена кнопка Add to reading list",
                5);
        waitForElementAndClick(By.id("org.wikipedia:id/item_title"),
                "не удалось добавить в список 2 статью",
                10);

        waitForElementAndClick(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),
                "Не удалось нажать Х",
                15);


      //String name_of_folder="Learning proraming";
     waitForElementAndClick(By.xpath("//android.widget.FrameLayout[@content-desc='My lists']"),
             "Не перешли в список My reading list ",
             5);

     waitForElementAndClick(By.xpath("//*[@text='"+name_of_folder+"']"),
             "Не найден созданный список Learning programming",
             5);


        swipeElementToLeft(By.xpath ("//android.widget.TextView[@text='Java (programming language)']/../.."),
                "Статья не удалилась свайпом");

        waitForElementNotPresentById(By.xpath("//*[@text='Java (programming language)']"),
                "Найдена статья, которую удалили ранее ",
                5);

        waitForElementPresent(By.xpath("//*[@text='JavaScript']"),
                "не найден статья про JavaScript",5 );

    } */

@Test
public void assertTitle() {


    waitForElementAndClick(
            By.xpath("//*[contains(@text,'Search Wikipedia')]"),
            "Cannot find Search Wikipedia input",
            5
    );
String text ="JAVA";
    waitForElementAndSendKeys(
            By.xpath("//*[contains(@text,'Search…')]"),
            text,
            "Cannot find search input",
            10
    );

    waitForElementAndClick(
            By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='JavaScript']"),
            "Cannot find JavaScript",
            5
    );

    assertElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "не найден заголовок статьи");





    }


    private WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds)
{
    WebDriverWait wait = new WebDriverWait(driver,timeoutInSeconds);
    wait.withMessage(error_message + "\n");
    return wait.until(
            ExpectedConditions.presenceOfElementLocated(by));

}


    private WebElement assertElementPresent (By by, String error_message)
    {

        return waitForElementPresent(by, error_message, 0);

        /*WebElement result = null;
        try{
            result = driver.findElement(by);
        } catch (NoSuchElementException e){
            //System.out.println("oops");
            //e.printStackTrace();
        }

        Assert.assertNotNull(error_message, result);
        return result;*/
    }




    private WebElement waitForElementPresent(By by, String error_message)
    {

        return waitForElementPresent(by, error_message, 5);

    }

    private WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds)
    {
      WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.click();
        return element;
    }

    private WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message,timeoutInSeconds);
        element.sendKeys(value);
        return element;
    }
     private WebElement waidForElementAndClear(By by, String error_message, long timeoutInSeconds)
     {
         WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
         element.clear();
         return element;
     }


    private boolean waitForElementNotPresentById (By by, String error_message, long timeoutInSeconds )
    {
        WebDriverWait wait = new WebDriverWait(driver,timeoutInSeconds);
        wait.withMessage(error_message+"\n");
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    private List<WebElement> waitForListElementById (String id, String error_message, long timeoutInSeconds ) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        By by = By.id(id);

        return wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(by, 1)
        );



    }
    protected void swipeUp (int timeOfSwipe)
    {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();  //в переменную size передаем параметры экрана
        int x = size.width/2;
        int start_y =(int) (size.height * 0.8);
        int end_y=(int) (size.height*0.2);

        action.press(x, start_y).waitAction(timeOfSwipe).moveTo(x,end_y).release().perform(); // порядок действий perform отправляет всю последовательность

    }

    protected void swipeUpQuick ()
    {
        swipeUp(200);

    }protected void swipeUpFindelement(By by,String error_message,int max_swipes)
    {
       // driver.findElements(by);
       // driver.findElements(by).size();
        int alrealy_swipes=0;


        while (driver.findElements(by).size()==0)
        {
            if(alrealy_swipes>max_swipes)
            {
              waitForElementPresent(by,
                      "не найден элемент на странице при свайпе\n"+error_message,
                      0);
                        return;
            }
            swipeUpQuick();
            ++alrealy_swipes;
        }

    }

   protected void swipeElementToLeft (By by, String error_message)
    {
        WebElement element = waitForElementPresent(by,
                error_message,
                10);
int left_x=element.getLocation().getX()+ (int) (element.getSize().getWidth()*0.1);
int right_x=left_x+ (int) (element.getSize().getWidth()*0.9);
int upper_y=element.getLocation().getY();
int lower_y=upper_y+element.getSize().getHeight();
int middle_y=upper_y+element.getSize().getHeight()/2;

TouchAction action=new TouchAction(driver);
action
        .press(right_x,middle_y)
        .waitAction(300)
        .moveTo(left_x,middle_y)
        .release()
        .perform();


    }

}

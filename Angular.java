package Learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Angular {

    public static void main(String[] args) throws Exception {

        //Initiating WebDriver Instance
        //Change ChromeDriver Path
        String chromeDriverPath="/Users/krishthakkar/Documents/WebDriver/chromedriver";

        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        String URL ="http://www.globalsqa.com/angularjs-protractor-practice-site/";
        basicMultiForm(driver, URL);
        intermediateUploadImage(driver, URL);
        smallSimpleCalculator(driver, URL);
    }

    public static void basicMultiForm(WebDriver driver, String URL) throws  Exception {

        System.out.println("*********Test 1: Basic Components*********");
        System.out.println("Selecting Multi Form");

        driver.get(URL);
        driver.findElement(By.cssSelector("#post-2777 > div:nth-child(4) > div > div > div.row.price_table_holder.col_3 > div:nth-child(1) > ul > li:nth-child(2) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"form-views\"]/div[1]/input")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@id=\"form-views\"]/div[2]/input")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@id=\"form-views\"]/div[3]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"form-views\"]/div[1]/div[1]/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-views\"]/div[2]/div/a/span")).click();
        Thread.sleep(1000);
        System.out.println("Selected values in multi form: "+driver.findElement(By.xpath("/html/body/div[1]/div/div/div/pre")).getText());
        driver.findElement(By.xpath("//*[@id=\"form-views\"]/div/button")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.quit();

    }
    public static void intermediateUploadImage(WebDriver driver, String URL) throws  Exception {

        driver=new ChromeDriver();
        System.out.println("*********Test 2: Intermediate Components*********");
        System.out.println("Selecting Upload Image");
        driver.get(URL);
        driver.findElement(By.cssSelector("#post-2777 > div:nth-child(4) > div > div > div.row.price_table_holder.col_3 > div:nth-child(2) > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("body > div > form > input[type=\"file\"]")).sendKeys("/Users/Krishthakkar/Downloads/0.jpeg");
        System.out.println("Image uploaded successfully!! \n size ="+driver.findElement(By.cssSelector(" body > div > img")).getSize());

       Thread.sleep(2000);
        driver.quit();

    }

        public static void smallSimpleCalculator(WebDriver driver, String URL) throws  Exception{

        driver=new ChromeDriver();
        System.out.println("*********Test 3: Small Projects *********");
        System.out.println("Selecting Small Calculator");
        driver.get(URL);
        driver.findElement(By.cssSelector("#post-2777 > div:nth-child(4) > div > div > div.row.price_table_holder.col_3 > div:nth-child(3) > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).sendKeys("50");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).sendKeys("50");
        System.out.println(driver.findElement(By.xpath("/html/body/div/b")).getText());
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).sendKeys("50");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/select")).sendKeys("-");
        System.out.println(driver.findElement(By.xpath("/html/body/div/b")).getText());
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).sendKeys("50");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/select")).sendKeys("/");
        System.out.println(driver.findElement(By.xpath("/html/body/div/b")).getText());
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).sendKeys("50");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).sendKeys("5");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/select")).sendKeys("*");
        System.out.println(driver.findElement(By.xpath("/html/body/div/b")).getText());
        Thread.sleep(2000);

        driver.quit();

        }
}
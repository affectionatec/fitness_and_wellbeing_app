package com.team4.fitness_and_wellbeing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertTrue;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class web_driver_test {


    @Value("${local.server.port}")
    private int port;




//        @BeforeClass
//        public static void setupClass() {
//            WebDriverManager.chromedriver().setup();
//        }
//
//        @Before
//        public void setupTest() {
//            driver = new ChromeDriver();
//        }
//
//        @After
//        public void teardown() {
//            if (driver != null) {
//                driver.quit();
//            }
//        }

        @Test
        public void web_driver_test() {

//            WebDriverManager.chromedriver().setup();
//            WebDriverManager.getInstance(CHROME).setup();
//            WebDriver driver = new ChromeDriver();

            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");


            ChromeOptions chromeOptions = new ChromeOptions();

            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");


            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.get("http://localhost:" + Integer.toString(port)+"/home");
            assertTrue(driver.findElement(By.id("logo")).getText().contains("PROJECT PHYT"));
            driver.quit();

        }

    }



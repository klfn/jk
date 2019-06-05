package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @AfterSuite
    public void afterSuite(){

        System.out.println("afterSuite运行了");

    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aftertest");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTEst");
    }
}


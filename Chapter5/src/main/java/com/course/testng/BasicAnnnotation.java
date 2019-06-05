package com.course.testng;
import org.testng.annotations.*;
public class BasicAnnnotation {

    @Test
    public void testcase1(){
        System.out.println("这是测试1");
    }

    @Test
    public void testcase2(){
        System.out.println("这是测试2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("事前");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("事后");
    }
}

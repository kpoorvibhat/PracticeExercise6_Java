package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UpperCaseLambdaStreamDemoTest {
    private static UpperCaseLambdaStreamDemo upperCaseLambdaStreamDemo;

    @BeforeClass
    public static void setup(){
        upperCaseLambdaStreamDemo = new UpperCaseLambdaStreamDemo();
    }

    @AfterClass
    public static void teardown(){
        upperCaseLambdaStreamDemo = null;
    }

    @Test
    public void testUpperCaseLambdaStream_GivenStringList_ShouldReturnUpperCaseStringList(){
        List<String> list = new ArrayList<>();
        list.add("deepak");
        list.add("poorvi");
        list.add("haripriya");
        list.add("shivani");

        List<String> upperCaseList = new ArrayList<>();
        upperCaseList.add("DEEPAK");
        upperCaseList.add("POORVI");
        upperCaseList.add("HARIPRIYA");
        upperCaseList.add("SHIVANI");

        assertEquals(upperCaseList, upperCaseLambdaStreamDemo.toUpperCase(list));

        list.clear();
        upperCaseList.clear();
    }
}

package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AverageLambdaStreamDemoTest {
    private static AverageLambdaStreamDemo averageLambdaStreamDemo;

    @BeforeClass
    public static void setup(){
        averageLambdaStreamDemo = new AverageLambdaStreamDemo();
    }

    @AfterClass
    public static void teardown(){
        averageLambdaStreamDemo = null;
    }

    @Test
    public void testAverageLambdaStreamDemo_GivenArrayList_ShouldReturnAverage(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(67);
        list.add(12);

        assertEquals(java.util.Optional.ofNullable(34.0), java.util.Optional.ofNullable(averageLambdaStreamDemo.average(list)));

        list.clear();
    }
}

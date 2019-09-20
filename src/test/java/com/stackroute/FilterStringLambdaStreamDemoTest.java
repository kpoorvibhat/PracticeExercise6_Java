package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterStringLambdaStreamDemoTest {
    private static FilterStringLambdaStreamDemo filterStringLambdaStreamDemo;

    @BeforeClass
    public static void setup(){
        filterStringLambdaStreamDemo = new FilterStringLambdaStreamDemo();
    }

    @AfterClass
    public static void teardown(){
        filterStringLambdaStreamDemo = null;
    }

    @Test
    public void testSearchLambdaStream_GivenStringList_ShouldReturnFilteredList(){
        List<String> list = new ArrayList<>();
        list.add("jyoti");
        list.add("aero");
        list.add("air");
        list.add("ashok");
        list.add("ani");

        List<String> filtered = new ArrayList<>();
        filtered.add("air");
        filtered.add("ani");

        assertEquals(filtered, filterStringLambdaStreamDemo.search(list));

        list.clear();
        filtered.clear();
    }
}

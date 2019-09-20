package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransformStringLambdaStreamDemoTest {

    private static TransformStringLambdaStreamDemo transformString;

    @BeforeClass
    public static void setup(){
        transformString = new TransformStringLambdaStreamDemo();
    }

    @AfterClass
    public static void teardown(){
        transformString = null;
    }

    @Test
    public void testTransformString_GivenIntegerList_ShouldReturnString(){

        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(44);

        assertEquals("o3,e44", transformString.getString(list));
    }

}

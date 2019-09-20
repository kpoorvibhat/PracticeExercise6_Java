package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class TransformStringLambdaStreamDemo {
    public String getString(List<Integer> list) {
        // Your code goes here
        String str = list.stream().map(num->(num%2)==0? "e" + num : "o" + num).collect(Collectors.joining(","));
        return str;
    }
}

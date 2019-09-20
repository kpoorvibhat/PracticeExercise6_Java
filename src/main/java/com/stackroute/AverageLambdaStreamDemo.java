package com.stackroute;

import java.util.List;
import java.util.OptionalDouble;

public class AverageLambdaStreamDemo {

        public Double average(List<Integer> list) {
        Double average = list.stream()
                .mapToDouble(a ->a)
                .average().getAsDouble();

        System.out.println(average);

        return average;
        }
}

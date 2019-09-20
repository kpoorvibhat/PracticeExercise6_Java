package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class FilterStringLambdaStreamDemo {
    public List<String> search(List<String> list) {

        List<String> filtered = new ArrayList<>();

        list.stream().filter(word->(word.startsWith("a") && word.length()==3)).forEach(word->filtered.add(word));

        return filtered;
    }
}

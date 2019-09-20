package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseLambdaStreamDemo {
        public List<String> toUpperCase(List<String> list) {

            List<String> upperCase = new ArrayList<String>();

            list.stream().map(word->word.toUpperCase()).forEach(word->upperCase.add(word));

            return upperCase;

        }

}

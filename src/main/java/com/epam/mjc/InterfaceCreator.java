package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> list) -> {
            List <Integer> newList = new ArrayList<>();
            for (Integer item : list){
                newList.add(item / divider);
            }
            return newList;
        };
    }
}

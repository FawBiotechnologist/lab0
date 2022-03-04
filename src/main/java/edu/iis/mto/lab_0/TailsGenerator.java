package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        int valueSize = value.length();
        ArrayList<String> list = new ArrayList<>(value.length());
        for(int i = 0; i <= valueSize; i++){
            String s = value.substring(i, valueSize);
            list.add(s);
        }
        return list;
    }

}

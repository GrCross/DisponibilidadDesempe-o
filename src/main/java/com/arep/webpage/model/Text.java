package com.arep.webpage.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text {


    String text;

    public Text(String text) {
        this.text =  text;
    }

    public Text() { }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<String,Integer> calcNumberOfstrings(){
        Map<String,Integer>counts = new HashMap<String,Integer>();
        String[] sArray = text.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            if(!counts.containsKey(sArray[i])) counts.put(sArray[i],0);
            else{counts.put(sArray[i],counts.get(sArray[i])+1);}
        }
        return counts;
    }
}

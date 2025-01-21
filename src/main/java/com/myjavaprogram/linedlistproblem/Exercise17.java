package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;

public class Exercise17 {

    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        LinkedList<String> data1 =new LinkedList<String>();
        data.add("Orange");
        data.add("Black");
         LinkedList<String> data2 =new LinkedList<String>();
        data.add("Orange");
        data.add("Black");
        data.addAll(data1);
        data.addAll(data2);
        System.out.println(data);

    }

}

package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;

public class Exercise10 {

    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        String a = data.getFirst();
        System.out.println(a);
        String b = data.getLast();
        System.out.println(b);

    }

}

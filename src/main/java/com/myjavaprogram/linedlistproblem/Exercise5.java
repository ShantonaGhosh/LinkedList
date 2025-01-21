package com.myjavaprogram.linedlistproblem;
import java.util.LinkedList;

public class Exercise5 {

    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");      
        data.set(0, "blue");
        System.out.println(data);
        

    }

}

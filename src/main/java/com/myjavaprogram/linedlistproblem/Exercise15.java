
package com.myjavaprogram.linedlistproblem;

import java.util.Collections;
import java.util.LinkedList;


public class Exercise15 {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        Collections.swap(data, 0, 2);
        System.out.println(data);
      

    }
    
}

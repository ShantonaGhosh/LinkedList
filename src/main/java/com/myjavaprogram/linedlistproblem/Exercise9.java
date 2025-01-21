
package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;

public class Exercise9 {
     public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");      
            LinkedList<String> data1 = new LinkedList<String>();
       data1.add("yellow");
        data1.add("lime");
        data.addAll(1, data1);
     
        System.out.println(data);
        

    }
    
}

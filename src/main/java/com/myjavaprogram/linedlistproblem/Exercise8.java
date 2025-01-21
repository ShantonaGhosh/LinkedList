
package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;


public class Exercise8 {
     public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");      
      
        data.offerLast("blue");
        System.out.println(data);
        

    }
    
}

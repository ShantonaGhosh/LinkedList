
package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;


public class Exercise18 {
     public static void main(String[] args) {
         LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        LinkedList<String> data1 = (LinkedList<String>) data.clone();
        System.out.println(data1);
      
        
       
      

    }
    
}

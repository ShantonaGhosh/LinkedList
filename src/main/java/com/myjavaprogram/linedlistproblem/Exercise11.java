
package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;


public class Exercise11 {
    
      public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        String a = data.getFirst();
      
        for(int i=0; i<data.size(); i++){
            System.out.println(" index "+i +" element" + data.get(i));
            
        }

    }
    
}

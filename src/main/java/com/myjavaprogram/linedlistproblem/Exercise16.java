
package com.myjavaprogram.linedlistproblem;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise16 {
        public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        Collections.shuffle(data);
        System.out.println(data);
      

    }
    
}


package com.myjavaprogram.linedlistproblem;

import java.util.ArrayList;
import java.util.LinkedList;


public class Exercise23 {
      public static void main(String[] args) {

        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        ArrayList<String> arrayList = new ArrayList<String>(data);
      for (String str : arrayList){
      System.out.println(str);
    }

    }
    
}


package com.myjavaprogram.linedlistproblem;

import java.util.Iterator;
import java.util.LinkedList;


public class Exercise3 {
     public static void main(String[] args){
         LinkedList<String> data = new LinkedList<String>();
       data.add("a");
       data.add("b");
       data.add("c");
      Iterator p = data.listIterator(2);
      while(p.hasNext()){
           System.out.println(p.next());
      }
       
   
           
       
     
    }
    
}
